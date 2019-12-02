# Rockstar-Auth-Flow
Rockstar Authentication Flow made in Java.

The API that is used in this project is from: 
https://rockstar-api.readthedocs.io/en/latest/index.html

For more information please contact me to the following platforms:
1. Discord: Thomas Platvis#1813
2. Twitter: @chinobman


# Look at this:
This is not made to be a huge project. It's to show basically how you authenticate within this API in Java. 
Don't expect a whole project. I might make a extended version for this project in the future.

# Basic understanding
To login with this api use the following code:

```
    public static void main(String[] args) {
        RockstarAPI api = new RockstarAPI("{YOUR EMAIL}", "{YOUR PASSWORD}"); //Login details
        
        api.login(); //Will let you login.
    }
```
