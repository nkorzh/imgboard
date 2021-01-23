CREATE TABLE IF NOT EXISTS offrum_table(
                                           title VARCHAR(70),
                                           content VARCHAR(2048),
                                           author VARCHAR(30),
                                           date TIMESTAMP,
                                           id BIGSERIAL PRIMARY KEY
);

INSERT INTO offrum_table ("title", "content", "author", "date", "id") VALUES ('Initial post', 'meaningless content',
                                                                              'pathetic author', '2001-11-09 04:05:06', 0);