# Rockstar-Auth-Flow
Rockstar Authentication Flow made in Java.

The API that is used in this project is from: 
https://rockstar-api.readthedocs.io/en/latest/index.html

For more information please contact me to the following platforms:
1. Discord: Sir Sloth#2250
2. Twitter: @srsloth18


# Quick Note:
This is not made to be a huge project. It's to show basically how you authenticate within this API in Java. 
Don't expect a whole project. I might make a extended version for this project in the future.

# Requirements / Dependencies
- Retrofit 2
- OkHttp3
- Okio 1.15
- JavaNetCookieJar

# Disclaimer
Using this Auth Flow might be a violation of Rockstar's Terms of Service. I take no responsibility for the way you use it. It is completely your responsibility

# Version
0.1

# Basic understanding
To login with this api use the following code:

```
    public static void main(String[] args) {
        RockstarAPI api = new RockstarAPI("{YOUR EMAIL}", "{YOUR PASSWORD}"); //Login details
        
        api.login(); //Will let you login.
    }
```
