DROP TABLE IF EXISTS users, events

CREATE TABLE IF NOT EXISTS users (
    id bigint GENERATED BY DEFAULT AS IDENTITY
)