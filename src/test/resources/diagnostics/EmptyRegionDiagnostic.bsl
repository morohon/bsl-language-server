#Область Тест
// комментарий                  // <- Ошибка
#КонецОбласти

// <- Нет ошибки
#Область Переменные
Перем А;
#КонецОбласти

// <- Ошибка, т.к. вложенная область пуста
#Область ВнешняяОбласть
// <- Ошибка
#Область ВнутренняяОбласть

#КонецОбласти
#КонецОбласти

// <- Нет ошибки
#Область Тест3
///

Функция Тест()
КонецФункции

Процедура Тест2()

// <- Нет ошибки
#Область Вложенная
    Если Условие Тогда
        Сообщить(1);
    КонецЕсли;
#КонецОбласти

КонецПроцедуры

#КонецОбласти

// <- Нет ошибки, т.к. вложенная не пуста
#Область ВнешняяНепустаяОбласть
// <- Нет ошибки
#Область ВнутренняяНепустаяОбласть

Функция Тест4()
КонецФункции

#КонецОбласти
#КонецОбласти

// <- Нет ошибки
#Область Инициализация
Для Каждого Строка Из Строки Цикл
    Прервать;
КонецЦикла;
#КонецОбласти
