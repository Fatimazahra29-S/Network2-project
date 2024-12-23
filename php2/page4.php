<?php
$ipAddress = "localhost";
$objectNames = [
    "snmpInPkts",
    "snmpOutPkts",
    "snmpInBadVersions",
    "snmpInBadCommunityNames",
    "snmpInBadCommunityUses",
    "snmpInASNParseErrs",
    "Skip OID 7",
    "snmpInTooBigs",
    "snmpInNoSuchNames",
    "snmpInBadValues",
    "snmpInReadOnlys",
    "snmpInGenErrs",
    "snmpInTotalReqVars",
    "snmpInTotalSetVars",
    "snmpInGetRequests",
    "snmpInGetNexts",
    "snmpInSetRequests",
    "snmpInGetResponses",
    "snmpInTraps",
    "snmpOutTooBigs",
    "snmpOutNoSuchNames",
    "snmpOutBadValues",
    "Skip OID 23",
    "snmpOutGenErrs",
    "snmpOutGetRequests",
    "snmpOutGetNexts",
    "snmpOutSetRequests",
    "snmpOutGetResponses",
    "snmpOutTraps",
    "snmpEnableAuthenTraps"
];

// Method 1: SNMP Group Statistics By Get
$snmpObjects = [];
for ($i = 0; $i < 30; $i++) {
    if ($i + 1 === 7 || $i + 1 === 23) {
        continue;
    }
    $value = snmp2_get($ipAddress, "public", ".1.3.6.1.2.1.11." . $i + 1 . ".0");
    $snmpObjects[$i] = explode(": ", $value, 2)[1];
}

// Method 2: SNMP Group Statistics By Walk
$snmpGroupStats = snmp2_walk($ipAddress, "public", ".1.3.6.1.2.1.11");

// Display SNMP Group Statistics in the Java application
for ($i = 1; $i <= 30; $i++) {
    if ($i === 7 || $i === 23) {
        continue;
    }
    echo $i . ",";
    echo $objectNames[$i - 1] . ",";
    echo $snmpObjects[$i - 1] . "\n";
}