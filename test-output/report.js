$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/LoginSample.feature");
formatter.feature({
  "line": 1,
  "name": "validate login Functionality",
  "description": "",
  "id": "validate-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2446500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "validate negative login functionality",
  "description": "",
  "id": "validate-login-functionality;validate-negative-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Navigate to utest url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter email \"EMAIL\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "validate the error message \"EXPECTED\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.navigate_to_utest_url()"
});
formatter.result({
  "duration": 5500006900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.click_on_sign_in_link()"
});
formatter.result({
  "duration": 1850600600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EMAIL",
      "offset": 13
    }
  ],
  "location": "StepDefination.enter_email(String)"
});
formatter.result({
  "duration": 5179983400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.click_on_sign_in_button()"
});
formatter.result({
  "duration": 482256700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EXPECTED",
      "offset": 28
    }
  ],
  "location": "StepDefination.validate_the_error_message(String)"
});
formatter.result({
  "duration": 675182500,
  "status": "passed"
});
});