public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 29;
        boolean isMaleGender = true;
        float height = 1.81f;
        char firstLetterOfName = 'K';
        if (age < 20) {
            System.out.println("�������" + age + " ������ 20");
        }
        if (isMaleGender) {
            System.out.println("�������� ����");
        }
        if (!isMaleGender) {
            System.out.println("�������� ����");
        }
        if (height < 1.80) {
            System.out.println("������� ��� �������� �����");
        } else {
            System.out.println("�������� ��� �������� �����");
        }
        if (firstLetterOfName == 'M') {
            System.out.println("������ ����� ����� �");
        } else if (firstLetterOfName == 'I'){
            System.out.println("������ ����� ����� I");
        } else {
            System.out.println("������ ����� ����� �� M � �� I");
        }
    }
}