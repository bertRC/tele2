public class Main {
    public static void main(String[] args) {
        Tariff myOldTariff = new Tariff();
        myOldTariff.id = 1;
        myOldTariff.name = "Мой онлайн+";
        myOldTariff.price = 350;
        myOldTariff.isPerMonth = true;
        myOldTariff.isSmart = true;
        myOldTariff.gigabytes = 20;
        myOldTariff.isUnlimitedSocialNetworks = true;
        myOldTariff.internetAdditionalfeatures = "Интернет за границей";
        myOldTariff.minutes = 600;
        myOldTariff.isUnlimitedToTele2 = true;

        System.out.println(myOldTariff.name);
        if (myOldTariff.price > 0) {
            System.out.print(myOldTariff.price + " \u20BD");
            if (myOldTariff.isPerMonth) {
                System.out.println("/месяц");
            } else {
                System.out.println("/день");
            }
        } else {
            System.out.println("Без абонентской платы");
        }
        if (myOldTariff.isSmart) {
            System.out.println("Умный тариф подстроится под вас");
        }
        if (myOldTariff.gigabytes > 0) {
            System.out.println(myOldTariff.gigabytes + " ГБ");
            if (myOldTariff.isUnlimitedSocialNetworks) {
                System.out.println("+безлимитные социальные сети");
            }
        } else {
            System.out.println("Безлимитный интернет");
        }
        if (myOldTariff.internetAdditionalfeatures != null) {
            System.out.println(myOldTariff.internetAdditionalfeatures);
        }
        if (myOldTariff.minutes > 0) {
            System.out.println(myOldTariff.minutes + " мин.");
        }
        if (myOldTariff.isUnlimitedToTele2) {
            System.out.println("+ безлимит на Tele2 Росии");
        }
        if (myOldTariff.smsCount > 0) {
            System.out.println(myOldTariff.smsCount + " SMS");
        }
        if (myOldTariff.isCustomizable) {
            System.out.println("Настроить тариф");
        }
    }
}
