// Work №4, Урок 4. ООП: Обобщения. ч1

// -- Создать класс Учитель;
// -- Создать класс УчительСервис (Добавляем валидацию);
// -- Создать класс УчительВью (Выводим в консоль);
// -- Создать класс УчительКонтроллер (Работа с данными: принимает данные в класс Учитель и отправляет в Учитель вью)
// и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, 
// имеющихся в системе;
// -- Создать класс ГруппаУчителей;
// -- Добавить поле учитель в учебную группу.

public class Main
{
    public static void main(String[] args)
    {
        TeacherView View = new TeacherView();
        TeacherServes Validate = new TeacherServes();
        TeacherController Controller = new TeacherController(Validate, View);

        Controller.addTeacher("Jon", "Math");
        Controller.addTeacher("Bell", "English");
        Controller.addTeacher("Roman", "Programming");

        Controller.editTeacher(2, "Horse", "Physics");
        
        Controller.TeacherView();
    }
}