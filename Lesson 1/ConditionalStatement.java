public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 29;
        boolean isMaleGender = true;
        float height = 1.81f;
        char firstLetterOfName = 'K';
        if (age < 20) {
            System.out.println("Возраст" + age + " больше 20");
        }
        if (isMaleGender) {
            System.out.println("Мужского пола");
        }
        if (!isMaleGender) {
            System.out.println("Женского пола");
        }
        if (height < 1.80) {
            System.out.println("Низкого или среднего роста");
        } else {
            System.out.println("Среднего или высокого роста");
        }
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfName == 'I'){
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }
    }
}