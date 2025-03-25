CREATE DATABASE IF NOT EXISTS university;
USE university;

CREATE TABLE IF NOT EXISTS students (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        last_name VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    middle_name VARCHAR(50) NOT NULL,
    birth_date DATE NOT NULL,
    record_book_number VARCHAR(20) NOT NULL UNIQUE
    );

INSERT INTO students (last_name, first_name, middle_name, birth_date, record_book_number) VALUES
                                                                                              ('Іваненко', 'Олександр', 'Сергійович', '2003-01-15', 'RB001'),
                                                                                              ('Петренко', 'Ігор', 'Юрійович', '2003-02-20', 'RB002'),
                                                                                              ('Шевчук', 'Олена', 'Василівна', '2003-03-10', 'RB003'),
                                                                                              ('Коваленко', 'Марія', 'Олександрівна', '2003-04-05', 'RB004'),
                                                                                              ('Романенко', 'Антон', 'Михайлович', '2003-05-25', 'RB005'),
                                                                                              ('Лисенко', 'Дмитро', 'Віталійович', '2003-07-11', 'RB006'),
                                                                                              ('Гордієнко', 'Світлана', 'Олексіївна', '2003-08-19', 'RB007'),
                                                                                              ('Дорошенко', 'Максим', 'Ігорович', '2003-09-30', 'RB008'),
                                                                                              ('Захаренко', 'Віктор', 'Євгенович', '2003-10-03', 'RB009'),
                                                                                              ('Клименко', 'Сергій', 'Борисович', '2003-11-12', 'RB010');