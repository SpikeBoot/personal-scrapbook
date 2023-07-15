package patterns.JavaBeans;

/*
    Чтобы класс мог работать как bean, он должен соответствовать определённым соглашениям
    об именах методов, конструкторе и поведении. Эти соглашения дают возможность создания инструментов, которые могут использовать, замещать и соединять JavaBeans.

    Правила описания гласят:

    - Класс должен иметь конструктор без параметров, с модификатором доступа public.
    Такой конструктор позволяет инструментам создать объект без дополнительных сложностей с параметрами.

    - Свойства класса должны быть доступны через get, set и другие методы (так называемые методы доступа),
    которые должны подчиняться стандартному соглашению об именах. Это легко позволяет инструментам автоматически определять и
    обновлять содержание bean’ов. Многие инструменты даже имеют специализированные редакторы для различных типов свойств.

    - Класс должен быть сериализуем. Это даёт возможность надёжно сохранять, хранить и восстанавливать состояние
    bean независимым от платформы и виртуальной машины способом.

    - Класс должен иметь переопределенные методы equals(), hashCode() и toString().

    Так как требования в основном изложены в виде соглашения, а не интерфейса, некоторые разработчики
    рассматривают JavaBeans, как Plain Old Java Objects, которые следуют определённым правилам именования.
 */


public class PersonBean implements java.io.Serializable {
    private String name;
    private boolean deceased;

    public PersonBean() {
    }

    // Методы геттеры (get) и сеттеры (set)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getDeceased() {
        return deceased;
    }
    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }

    // Переопределенные методы equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PersonBean that = (PersonBean) o;

        if (deceased != that.deceased) {
            return false;
        }
        return !(name != null ? !name.equals(that.name) : that.name != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (deceased ? 1 : 0);
        return result;
    }

    // Переопределенный метод toString()
    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", deceased=" + deceased +
                '}';
    }
}
