$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/nwairagade/eclipse-workspace/Test_Workspace/MOT/src/test/java/features/service_layer_bean.feature");
formatter.feature({
  "line": 1,
  "name": "Car Reg number data comparison",
  "description": "In order to compare the data present in excel/csv file\r\nAs a tester\r\nI want to check the data matches with DVLA website",
  "id": "car-reg-number-data-comparison",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Scanning of directory for csv and excel files",
  "description": "",
  "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User is on \"C:\\\\Users\\\\nwairagade\\\\Documents\\\\Car_Reg_Data\" directory with readable files",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user opens the excel or csv \u003cfile\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \u003creg no\u003e on webpage",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user is shown \u003cMake\u003e and \u003cColour\u003e of car and test result",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;",
  "rows": [
    {
      "cells": [
        "file",
        "reg no",
        "Make",
        "Colour"
      ],
      "line": 13,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;1"
    },
    {
      "cells": [
        "Registration1.xlsx",
        "NM06BHP",
        "FORD",
        "BLACK"
      ],
      "line": 14,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;2"
    },
    {
      "cells": [
        "Registration2.xlsx",
        "KW15ZWD",
        "SEAT",
        "GREY"
      ],
      "line": 15,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;3"
    },
    {
      "cells": [
        "Registration3.xlsx",
        "WM17GNP",
        "TOYOTA",
        "WHITE"
      ],
      "line": 16,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;4"
    },
    {
      "cells": [
        "Registration4.xlsx",
        "X102ANV",
        "FORD",
        "BLUE"
      ],
      "line": 17,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;5"
    },
    {
      "cells": [
        "Registration5.xlsx",
        "EJ12ZZH",
        "AUDI",
        "RED"
      ],
      "line": 18,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;6"
    },
    {
      "cells": [
        "Registration6.csv",
        "T227HWN",
        "VOLSKAWAGEN",
        "RED"
      ],
      "line": 19,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;7"
    },
    {
      "cells": [
        "Registration7.csv",
        "RJ55FBK",
        "SKODA",
        "SILVER"
      ],
      "line": 20,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;8"
    },
    {
      "cells": [
        "Registration8.csv",
        "ML13WVY",
        "FORD",
        "RED"
      ],
      "line": 21,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;9"
    },
    {
      "cells": [
        "Registration9.csv",
        "PX63FSE",
        "SEAT",
        "WHITE"
      ],
      "line": 22,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;10"
    },
    {
      "cells": [
        "Registration10.csv",
        "X319CWN",
        "AUDI",
        "BLUE"
      ],
      "line": 23,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;11"
    },
    {
      "cells": [
        "Registration11.xlsx",
        "AK02NJF",
        "SKODA",
        "ORANGE"
      ],
      "line": 24,
      "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;12"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9185386422,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Scanning of directory for csv and excel files",
  "description": "",
  "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User is on \"C:\\\\Users\\\\nwairagade\\\\Documents\\\\Car_Reg_Data\" directory with readable files",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user opens the excel or csv Registration1.xlsx",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user enters the NM06BHP on webpage",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user is shown FORD and BLACK of car and test result",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\"C:\\\\Users\\\\nwairagade\\\\Documents\\\\Car_Reg_Data\"",
      "offset": 11
    }
  ],
  "location": "service_bean_steps_definitions.User_is_on_path_of_directory_with_readable_files(String)"
});
formatter.result({
  "duration": 334153941,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration1.xlsx",
      "offset": 28
    }
  ],
  "location": "service_bean_steps_definitions.user_opens_the_excel_or_csv_file(String)"
});
formatter.result({
  "duration": 4950082,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NM06BHP",
      "offset": 20
    }
  ],
  "location": "service_bean_steps_definitions.the_user_can_enter_the_reg_no(String)"
});
formatter.result({
  "duration": 4206234158,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FORD",
      "offset": 18
    },
    {
      "val": "BLACK",
      "offset": 27
    }
  ],
  "location": "service_bean_steps_definitions.the_user_is_shown_make_and_colour_of_car(String,String)"
});
formatter.result({
  "duration": 7714728,
  "error_message": "java.lang.NullPointerException\r\n\tat page.Objects.RegConfirmPage.car_make(RegConfirmPage.java:47)\r\n\tat step_definitions.service_bean_steps_definitions.the_user_is_shown_make_and_colour_of_car(service_bean_steps_definitions.java:55)\r\n\tat ✽.Then the user is shown FORD and BLACK of car and test result(C:/Users/nwairagade/eclipse-workspace/Test_Workspace/MOT/src/test/java/features/service_layer_bean.feature:10)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 7216819631,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Scanning of directory for csv and excel files",
  "description": "",
  "id": "car-reg-number-data-comparison;scanning-of-directory-for-csv-and-excel-files;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User is on \"C:\\\\Users\\\\nwairagade\\\\Documents\\\\Car_Reg_Data\" directory with readable files",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user opens the excel or csv Registration2.xlsx",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user enters the KW15ZWD on webpage",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user is shown SEAT and GREY of car and test result",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\"C:\\\\Users\\\\nwairagade\\\\Documents\\\\Car_Reg_Data\"",
      "offset": 11
    }
  ],
  "location": "service_bean_steps_definitions.User_is_on_path_of_directory_with_readable_files(String)"
});
formatter.result({
  "duration": 1130477,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration2.xlsx",
      "offset": 28
    }
  ],
  "location": "service_bean_steps_definitions.user_opens_the_excel_or_csv_file(String)"
});
formatter.result({
  "duration": 182371,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "KW15ZWD",
      "offset": 20
    }
  ],
  "location": "service_bean_steps_definitions.the_user_can_enter_the_reg_no(String)"
});
formatter.result({
  "duration": 3929945579,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SEAT",
      "offset": 18
    },
    {
      "val": "GREY",
      "offset": 27
    }
  ],
  "location": "service_bean_steps_definitions.the_user_is_shown_make_and_colour_of_car(String,String)"
});
formatter.result({
  "duration": 991904,
  "error_message": "java.lang.NullPointerException\r\n\tat page.Objects.RegConfirmPage.car_make(RegConfirmPage.java:47)\r\n\tat step_definitions.service_bean_steps_definitions.the_user_is_shown_make_and_colour_of_car(service_bean_steps_definitions.java:55)\r\n\tat ✽.Then the user is shown SEAT and GREY of car and test result(C:/Users/nwairagade/eclipse-workspace/Test_Workspace/MOT/src/test/java/features/service_layer_bean.feature:10)\r\n",
  "status": "failed"
});
