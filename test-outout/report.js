$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginfeature.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "Scenario : Validate site Launching\nGiven launch site using chrome\nthen title contains \"freeSms\"\nand close site",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "validate login operation",
  "description": "",
  "id": "login;validate-login-operation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Launch site using chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user name is \"\u003cx\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "pwd is \"\u003cy\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "validate output for criteria \"\u003cz\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close site",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login;validate-login-operation;",
  "rows": [
    {
      "cells": [
        "x",
        "y",
        "z"
      ],
      "line": 18,
      "id": "login;validate-login-operation;;1"
    },
    {
      "cells": [
        "9490010786",
        "Sudhesh",
        "Send Free SMS"
      ],
      "line": 20,
      "id": "login;validate-login-operation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "validate login operation",
  "description": "",
  "id": "login;validate-login-operation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Launch site using chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user name is \"9490010786\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "pwd is \"Sudhesh\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "validate output for criteria \"Send Free SMS\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close site",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.launch_site_using_chrome()"
});
formatter.result({
  "duration": 9603783333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9490010786",
      "offset": 14
    }
  ],
  "location": "StepDefinition.user_name_is(String)"
});
formatter.result({
  "duration": 6496937,
  "error_message": "java.lang.NullPointerException\r\n\tat Pages.LoginPage.fillmbno(LoginPage.java:43)\r\n\tat stepDef.StepDefinition.user_name_is(StepDefinition.java:33)\r\n\tat ✽.When user name is \"9490010786\"(loginfeature.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sudhesh",
      "offset": 8
    }
  ],
  "location": "StepDefinition.pwd_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.click_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Send Free SMS",
      "offset": 30
    }
  ],
  "location": "StepDefinition.validate_output_for_criteria(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.close_site()"
});
formatter.result({
  "status": "skipped"
});
});