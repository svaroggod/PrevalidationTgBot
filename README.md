# PrevalidationTgBot

Для оценки качества превалидации НБКИ, получение  файла из телеграмм бота, оценка вида и количества ошибок в сформированном csv-файле для разных организаций, создание отчетного excel файла по модели в соответствии с требованиями:

    Программа парсит csv-файл по определенным столбцам 
    1.1 Добавить возможность указывать путь csv-файлы на загрузку.
    Программа сканирует по заданным полям данные в столбцах построчно.
    2.1 Добавить возможность добавлять поля. (Указываться поля будут такие же как и в csv-файле)!!!
    Программа выполняет тесты по полям. 
    3.1 (Виды тестов могут добавляться)!!!
    Программа присваивает ответы в соответствии с результатом теста. 
    4.1 Результаты обработки сохранять и группировать по "ошибкам в полях" (пример: сделали все тесты с полем BirthPlace, сохранили результаты. Потом следующее поле).
    Полученные данные программа сохраняет в виде excel-файла 
    5.1 Добавить возможность выбирать путь сохранения и наименования файла excel.
    5.2 Значения "Номер договора", "Дата выдачи договора", "Фамилия", "Имя", "Отчество" берутся из файлов csv.
    5.3 Сохранять данные в excel в ячейки с форматом "текстовый".

