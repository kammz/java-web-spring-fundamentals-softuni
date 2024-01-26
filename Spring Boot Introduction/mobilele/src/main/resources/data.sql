INSERT INTO users (id, active, email, first_name, last_name, password)
VALUES (1, 1, 'admin@example.com', 'Admin', 'Adminov',
        '5f58a566039582af03408ce8f637ab131b7d6e4d4e6bd795bad6840295141ec255b0f50f3a02585ccff700701c4f24b4');

INSERT INTO brands (id, brand)
VALUES (1, 'Toyota'),
       (2, 'Ford');

INSERT INTO models (id, category, name, brand_id)
VALUES (1, 'CAR', 'Camry', 1),
       (2, 'CAR', 'Corolla', 1),
       (3, 'MOTORCYCLE', 'Focus', 2),
       (4, 'CAR', 'Fiesta', 2);