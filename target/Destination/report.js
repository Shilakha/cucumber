$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/LogIn_Test.feature");
formatter.feature({
  "name": "Login Action",
  "description": "\tDescription: This feature will test a LogIn and LogOut functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Loginandlogout"
    }
  ]
});
formatter.step({
  "name": "user navigates to https://www.eazework.com/login/",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user logs in using shilakha as USER",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "password as \"Hello@123\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Message displayed logout successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});