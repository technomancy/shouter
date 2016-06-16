# shouter

A simple Clojure web app, using [ring](https://github.com/ring-clojure/ring), [compojure](https://github.com/weavejester/compojure) and [hiccup](https://github.com/weavejester/hiccup).  Short text messages called "shouts" can be entered and the last 100 shouts are shown on the page.

Shout text strings are stored in a [postgres](http://www.postgresql.org/) database

## Deploy via Heroku button

  You can deploy your own copy of the Shouter app on Heroku via [![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

> If you do not have an account on Heroku, you will be promted to create one for free

## Deploying on Heroku manually

  To deploy the Shouter Clojure app on Heroku, first clone the project using `git clone clone-URL`, the clone-URL is underneat the repository menu on the right hand side of this page.
  
  Assuming you have Heroku Toolbelt installed, run `heroku create` from within the directory created by the previous clone command.
  
  Add a postgres database to your heroku app using the command:
  
    heroku addons:add heroku-postgresql

> This command adds a free Heroku postgres database plan

  Now deploy the Shouter web app to Heroku using the command:
  
    git push heroku master

## License

Copyright Aaron Bedra

Distributed under the Eclipse Public License, the same as Clojure.
