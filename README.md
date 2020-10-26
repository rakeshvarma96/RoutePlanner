# RoutePlanner
Suggests routes based on fare, duration

# Instructions to run the app

1. clone the git repository

2. Go to the pom file directory

3. Do "mvn clean install"

4. Run the application as jar 
(i.e., "java -jar <path_to_the_application_jar>")

5. Application jar can be found in the target folder.

6. Curl request which is used to fetch the routes is

curl --location --request POST 'localhost:8080/api/routes/find' \
--header 'Content-Type: application/json' \
--data-raw '{
    "from": "Bengaluru",
    "to": "Hyderabad",
    "sortBy": "DURATION",
    "date": "2020-10-25"
}'