CREATE TABLE public.dummy (
	id serial4 NOT NULL,
	"name" varchar(30) NULL
);

INSERT INTO public.dummy (id, "name") VALUES(nextval('dummy_id_seq'::regclass), 'Harold Adrian');
INSERT INTO public.dummy (id, "name") VALUES(nextval('dummy_id_seq'::regclass), 'Adrian David');
INSERT INTO public.dummy (id, "name") VALUES(nextval('dummy_id_seq'::regclass), 'Juan Jose');
INSERT INTO public.dummy (id, "name") VALUES(nextval('dummy_id_seq'::regclass), 'Juan David');

INSERT INTO public.dummy (id, "name") VALUES(nextval('dummy_id_seq'::regclass), 'Stefania');
INSERT INTO public.dummy (id, "name") VALUES(nextval('dummy_id_seq'::regclass), 'Alexandra');
INSERT INTO public.dummy (id, "name") VALUES(nextval('dummy_id_seq'::regclass), 'Ibeth');

SELECT id, "name" FROM public.dummy;