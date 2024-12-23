<?php
$ipAddress = "localhost";

// Content of TCP Table
$tcpLocalAddress = snmp2_walk($ipAddress, "public", ".1.3.6.1.2.1.6.13.1.2");
$tcpLocalPort = snmp2_walk($ipAddress, "public", ".1.3.6.1.2.1.6.13.1.3");

// Display TCP Table in the Java application
for ($i = 0; $i < count($tcpLocalAddress); $i++) {
    echo $i . ",";
    echo $tcpLocalAddress[$i] . ",";
    echo $tcpLocalPort[$i] . "\n";
}