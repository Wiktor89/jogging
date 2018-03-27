CREATE TABLE IF NOT EXISTS jogging.users_j (
  id INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('users_id_seq'::regclass),
  login CHARACTER VARYING(50) NOT NULL,
  password CHARACTER VARYING(50) NOT NULL,
  jog_id INTEGER,
  "create" TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT now(),
  FOREIGN KEY (jog_id) REFERENCES jogging.jogging (id)
  MATCH SIMPLE ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE UNIQUE INDEX users_login_uindex ON users_j USING BTREE (login);


CREATE TABLE IF NOT EXISTS jogging.jogging (
  id INTEGER PRIMARY KEY NOT NULL DEFAULT nextval('jogging_id_seq'::regclass),
  startdate DATE NOT NULL,
  enddate TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT now()
);