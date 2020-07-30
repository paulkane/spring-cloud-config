Server
------
points to 
`spring.cloud.config.server.git.searchPaths = configuration/{profile}`

Uses `spring.profiles.active`

By default this will look:

`{gitProject}/configuration/default/application.properties`

When `spring.profiles.active=one,two`

if will look default to 
* `{gitProject}/configuration/one/application.properties`
* `{gitProject}/configuration/two/application.properties`

any properties in `two` will override `one`

If there is a properties file which matches the App name it will do: 
* `{gitProject}/configuration/one/application.properties`
* `{gitProject}/configuration/two/application.properties`
* `{gitProject}/configuration/two/myApp.properties`

any properties in `myApp.propertes` will override `two` which in turn will override `one`



