# Outputs
Couple of saved outputs:
- ER Diagram: https://hnygard.github.io/eva-admin-spring-boot-hacktogether/database-diagram.png
- H2 syntax: https://hnygard.github.io/eva-admin-spring-boot-hacktogether/create.sql
- Postgresql syntax: https://hnygard.github.io/eva-admin-spring-boot-hacktogether/create-postgresql.sql
- https://hnygard.github.io/eva-admin-spring-boot-hacktogether/tables.html


# Starting Spring boot and opening H2 console
- Start up: `./mvnw spring-boot:run` (or run `H2Application`)
- Open http://localhost:8090/h2-console/
- Connection string: `jdbc:h2:mem:db`
- Username: `sa`
- Password: `sa`

# Running with PostgreSQL

- Start container with Postgres and Adminer (admin tool):
`cd docker-posgres; docker-compose up;`
- Database should start up and Adminer available on http://localhost:8091/ (system: `PostgreSQL`, server: `eva-postgres` db: `evaadmin`, user: `evaadmin`, pass: `evaadmin`)
- Run `PostgresqlApplication`

Database should now be filled up with tables. The `create-postgresql.sql` contains the create statements.

# Creating ER diagram


https://hnygard.github.io/eva-admin-spring-boot-hacktogether/database-diagram.png

The diagram listed above is created with DBeaver connected to PostgreSQL database above.