CREATE TABLE IF NOT EXISTS offrum_table(
                                           title VARCHAR(70),
                                           content VARCHAR(2048),
                                           author VARCHAR(30),
                                           date TIMESTAMP,
                                           id BIGSERIAL PRIMARY KEY NOT NULL
);
create unique index offrum_id_uindex on offrum_table(id);

INSERT INTO offrum_table ("title", "content", "author", "date", "id") VALUES
('Initial post', 'meaningless content', 'pathetic author', '2001-11-09 04:05:06', 0),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 7),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 8),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 9),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 10),
('titleeee', 'contentfsdgsdg', 'my name!', '2001-11-09 04:05:06', 11),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 12),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 13),
('titleeee', 'ыыыыыыыыыыыыыы', 'my name!', '2001-11-09 04:05:06', 14),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 15),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 16),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 17),
('titleeee', 'content', 'my name!', '2001-11-09 04:05:06', 18);

select * from offrum_table;