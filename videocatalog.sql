
SELECT * FROM videocatalog.videos;

INSERT INTO videocatalog.videos (name, description, category, url, release_date, age_rating, duration, cover_image)
VALUES ('Exemplo de Vídeo', 'Descrição do vídeo', 'Categoria', 'http://url-do-video.com', '2023-01-01', 'PG-13', 120, 'http://url-da-imagem.com'),
	   ('Homem Aranha', 'Filme de ação e pode conter violência', 'Ação', 'http://url2-do-video.com', '2023-10-01', 'PG-13', 120, 'http://url2-da-imagem.com'),
       ('Senhor dos Aneis', 'Filme top', 'Ação', 'http://url3-do-video.com', '2023-01-01', 'PG-13', 120, 'http://url3-da-imagem.com'),
	   ('Harry Potter', 'Fime de Magia', 'Ação', 'http://url4-do-video.com', '2023-10-01', 'PG-13', 120, 'http://url4-da-imagem.com');
       
SELECT * FROM videocatalog;

