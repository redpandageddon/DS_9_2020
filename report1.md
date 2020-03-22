| ФЕДЕРАЛЬНОЕ ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ ОБРАЗОВАТЕЛЬНОЕ УЧРЕЖДЕНИЕ ВЫСШЕГО ОБРАЗОВАНИЯ
ВЯТСКИЙ ГОСУДАРСТВЕННЫЙ УНИВЕРСИТЕТИнститут математики и информационных системФакультет автоматики и вычислительной техникиКафедра систем автоматизации управления |
| --- |
| «ЗНАКОМСТВО С ЯЗЫКОМ ПРОГРАММИРОВАНИЯ JAVA»Отчет по самостоятельной работе №1по дисциплине«Основы интернет и интернет-девелопмента»Вариант 9 |
|   | Выполнил: |
|   | студент гр. ИТб-2301 |
|   | Лапухин В.В. |
|   | Проверил: |
|   | Земцов М.А. |
| Киров  2020 |

**Цель работы:** изучение базовых основ программирования на языке Java и конфигурирование среды разработки NetBeans.

1. Установите OpenJDK или Oracle JDK.

В соответствии с рисунком 1, в ходе работы был установлен OpenJDK 13.

1. Установите NetBeans.

В ходе работы была установлена IDENetBeans 11.

1. Запустите NetBeans IDE: ярлык на рабочем столе  или Пуск → Про-граммы → NetBeans → NetBeans IDE.

4. Выберите пункт меню Файл → Создать проект.

5. Выберите пункт Java (Категории) → Библиотека классов Java (Про-екты).

6. Укажите имя проекта и путь. Нажмите на кнопку «Готово».

7. Перед вами откроется среда визуальной разработки приложений

8. Создайте пакет для типов и назовите его, например, types.

Работа, выполненная по пунктам 3-8, соответствует рисунку 2.

9. Создайте класс, например, Tovar.

10. Определите необходимый набор полей.

11. Добавьте конструктор без параметров: правая кнопка мыши → «Вставка кода…» → Конструктор → Создать.

12. В полученном методе определите все значения полей в значения по умолчанию:

13. Добавить конструктор с параметрами: правая кнопка мыши → «Вставка кода…» → Конструктор → отметить все поля → Создать.

14. В результате сгенерируется программный код.

15. Добавьте методы получения и установки значений полей: Добавьте конструктор с параметрами: правая кнопка мыши → «Вставка кода…» → Методы получения и установки → отметить все поля → Создать.

16. Сформируется следующий программный код:

Результаты выполнения пунктов 9-16 соответствуют листингу 1.

Листинг1:

package types;

public class Tovar {

    private String name;

    private int kol;

    private double price;

    public Tovar() {

        name = &quot;&quot;;

        kol = 0;

        price = 0;

    }

    public Tovar(String name, int kol, double price) {

        this.name = name;

        this.kol = kol;

        this.price = price;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getKol() {

        return kol;

    }

    public void setKol(int kol) {

        this.kol = kol;

    }

    public double getPrice() {

        return price;

    }

    public void setPrice(double price) {

        this.price = price;

    }

}

17. Создайте пакеты: operation – для классов обработки, base – для класса формы.

Результат пункта 17 соответствует рисунку 3.

18. Добавьте в пакет operationinterfaceTovarOperation.

Результат пункта 18 соответствует листингу 2.

Листинг 2:

package operation;

import java.util.List;

import types.Tovar;

public interface ITovarOperation {

    List\&lt;Tovar\&gt; getListOfTovar();

    List\&lt;Tovar\&gt; addNewTovar(Tovar item);

    int getSumOfTovar();

}

19. Добавьтевпакет operation class TovarOperation.

Результат пункта 19 соответствует листингу 3.

Листинг 3:

package operation;

import java.util.ArrayList;

import java.util.List;

import types.Tovar;

public class TovarOperation implements ITovarOperation {

    static List\&lt;Tovar\&gt; lstTovar = new ArrayList\&lt;\&gt;();

    static{

        lstTovar.add(new Tovar(&quot;Товар1&quot;,10,100));

        lstTovar.add(new Tovar(&quot;Товар2&quot;,20,200));

        lstTovar.add(new Tovar(&quot;Товар3&quot;,30,300));

        lstTovar.add(new Tovar(&quot;Товар4&quot;,40,400));

    }

    @Override

    public List\&lt;Tovar\&gt; getListOfTovar(){

        return lstTovar;

    }

    @Override

    public List\&lt;Tovar\&gt; addNewTovar(Tovar item){

        lstTovar.add(item);

        return lstTovar;

    }

    @Override

    public int getSumOfTovar(){

        int s = 0;

        for(Tovar tmp : lstTovar){

            s += tmp.getKol() \* tmp.getPrice();

        }

        return s;

    }

}

20. Создайте форму (JFrame) в пакете base и поместите на форму объекты в соответствии с эскизом формы и таблицей свойств объектов.

Результат пункта 20 соответствует рисункам 4 и 5.

21. Структура проекта должна быть следующей.

Структура проекта соответствует рисунку 6.

22. Программный по файлам.

Программный код соответствует листингам 1 и 4.

Листинг 4 – класс form:

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:

        dlgAdd.setSize(300, 320);

        dlgAdd.setVisible(true);

    }

    private void btnDecideActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:

    txtTotalSumma.setText(Integer.toString(tovarOperation.getSumOfTovar()));

    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:

        setDefaultCloseOperation(this.EXIT\_ON\_CLOSE);

        System.exit(0);

    }

    private void btnAddTovarActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:

                dlgAdd.setVisible(false);

        // д.б. код для проверки полей на правильность ввода

        Tovar el;

        if (rdbYesParam.isSelected()) {

            el = new Tovar(cmbName.getSelectedItem().toString(), (int) spnKol.getValue(), scrPrice.getValue());

        } else {

            el = new Tovar();

            el.setName(cmbName.getSelectedItem().toString());

            el.setKol((int) spnKol.getValue());

            el.setPrice(scrPrice.getValue());

        }

        doVivod(tovarOperation.addNewTovar(el));

    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:

        dlgAdd.setVisible(false);

    }

    private void scrPriceAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {

        // TODO add your handling code here:

        lblPriceInfo.setText(Integer.toString((int) scrPrice.getValue()));

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        // TODO add your handling code here:

        model = (DefaultTableModel)tbl.getModel();

        doVivod(tovarOperation.getListOfTovar());

    }

    TovarOperation tovarOperation = new TovarOperation();

    static DefaultTableModel model = new DefaultTableModel();

    private void doVivod(List\&lt;Tovar\&gt; lstTovar){

        doClearTable();

        int i = 1;

        for(Tovar tovar: lstTovar){

            Object[] rowData = new Object[5];

            rowData[0] = i++;

            rowData[1] = tovar.getName();

            rowData[2] = tovar.getPrice();

            rowData[3] = tovar.getKol();

            rowData[4] = tovar.getPrice() \* tovar.getKol();

            model.addRow(rowData);

        }

    }

    private void doClearTable(){

        while (model.getRowCount()\&gt;0){

            model.removeRow(0);

        }

  }

23. Протестируйте работу полученного приложения.

Результаты тестирования соответствуют рисунку 7.

24. Согласно варианта разработайте аналогичное приложение для заданной предметной области со следующими требованиями:

− количество классов 7. Классы должны демонстрировать основные принципы ООП (агрегация, ассоциация, наследование и т.д.);

− приложение должно иметь графический интерфейс;

− приложение должно содержать главное меню;

− приложение должно содержать работу со справочниками (количество справочников задается вариантом задания)

− приложение должно реализовывать работу с основными дынными согласно варианта задания. Данные визуализируются в таблицу которая должна иметь поддержку следующих операций: добавление, удаление, получение всего списка, пересчет какого-нибудь вычисляемого поля.

| 9 | Финская баня | Виды веников, персонал, расходные материалы, поставщики, Перечень услуг |
| --- | --- | --- |

Структура приложения соответствует рисунку 8.

GUI соответствует рисункам 9-10.

Некоторые принципы ООП, реализованные в приложении, соответствуют листингам 5-7.

Листинг 5 – инкапсуляция:

    private String description;

    private double price;

    private double time;

    private branch venik;

    public action(String description, double price, double time, branch venik) {

        this.description = description;

        this.price = price;

        this.time = time;

        this.venik = venik;

    }

    public String getDescription() {

        return description;

    }

    public double getPrice() {

        return price;

    }

    public double getTime() {

        return time;

    }

    public String getVenik() {

        return venik.toString();

    }

Листинг 6 – полиморфизм:

    @Override

    public String toString(){

        return description + &quot;\t&quot; + price + &quot;\t&quot; + time + &quot;\t&quot; + venik.toString();

    }

Листинг 7 – композиция:

public class action {

    private String description;

    private double price;

    private double time;

    private branch venik;

**Вывод:** в ходе самостоятельной работы были получены базовые навыки программирования приложений с графическим пользовательским интерфейсом на языке Java с использованием интегрированный среды разработки NetBeans.