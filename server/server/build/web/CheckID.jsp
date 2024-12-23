<%@page import="java.io.IOException"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    boolean flag = false;
    
    // Get id and password
    String id = request.getParameter("id");
    String password = request.getParameter("password");
    
    // Read Database
    String filePath = application.getRealPath("/WEB-INF/users.txt");
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(":");
            if (parts.length == 3) {
                String storedID = parts[1].trim();
                String storedPassword = parts[2].trim();
                
                // Validate ID and password
                if (id.equals(storedID) && password.equals(storedPassword)) {
                    flag = true;
                }
            }
        }
        
        // Send Response
        if (flag) {
            out.println("Permit");
        } else {
            out.println("Deny");
        }
    } catch (IOException e) {
        out.println("Database Error!");
    }
%>
