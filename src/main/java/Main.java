public class Main {
    public static void main(String[] args) {
        Tariff myOldTariff = new Tariff();
        myOldTariff.id = 1;
        myOldTariff.name = "Мой онлайн+";
        myOldTariff.price = 350;
        myOldTariff.payPeriod = "месяц";
        myOldTariff.isSmart = true;
        myOldTariff.megabytes = 20_000;
        myOldTariff.isUnlimitedSocialNetworks = true;
        myOldTariff.internetAdditionalFeatures = "Интернет за границей";
        myOldTariff.minutes = 600;
        myOldTariff.isUnlimitedToTele2 = true;

        System.out.println(myOldTariff.name);
        if (myOldTariff.price > 0) {
            System.out.println(myOldTariff.price + " \u20BD/" + myOldTariff.payPeriod);
        } else {
            System.out.println("Без абонентской платы");
        }
        if (myOldTariff.isSmart) {
            System.out.println("Умный тариф подстроится под вас");
        }
        if (myOldTariff.megabytes > 0) {
            if (myOldTariff.megabytes >= 1_000) {
                int gigabytes = myOldTariff.megabytes / 1_000;
                System.out.println(gigabytes + " ГБ");
            } else {
                System.out.println(myOldTariff.megabytes + " МБ");
            }
            if (myOldTariff.isUnlimitedSocialNetworks) {
                System.out.println("+безлимитные социальные сети");
            }
        } else {
            System.out.println("Безлимитный интернет");
        }
        if (myOldTariff.internetAdditionalFeatures != null) {
            System.out.println(myOldTariff.internetAdditionalFeatures);
        }
        if (myOldTariff.minutes > 0) {
            System.out.println(myOldTariff.minutes + " мин.");
        }
        if (myOldTariff.isUnlimitedToTele2) {
            System.out.println("+ безлимит на Tele2 России");
        }
        if (myOldTariff.smsCount > 0) {
            System.out.println(myOldTariff.smsCount + " SMS");
        }
        if (myOldTariff.isCustomizable) {
            System.out.println("Настроить тариф");
        }

        System.out.println("");

        Tariff myNewTariff = new Tariff();
        myNewTariff.id = 2;
        myNewTariff.name = "Интернет для вещей";
        myNewTariff.price = 100;
        myNewTariff.payPeriod = "месяц";
        myNewTariff.megabytes = 300;
        myNewTariff.minutes = 30;
        myNewTariff.smsCount = 100;

        System.out.println(myNewTariff.name);
        if (myNewTariff.price > 0) {
            System.out.println(myNewTariff.price + " \u20BD/" + myNewTariff.payPeriod);
        } else {
            System.out.println("Без абонентской платы");
        }
        if (myNewTariff.isSmart) {
            System.out.println("Умный тариф подстроится под вас");
        }
        if (myNewTariff.megabytes > 0) {
            if (myNewTariff.megabytes >= 1_000) {
                int gigabytes = myNewTariff.megabytes / 1_000;
                System.out.println(gigabytes + " ГБ");
            } else {
                System.out.println(myNewTariff.megabytes + " МБ");
            }
            if (myNewTariff.isUnlimitedSocialNetworks) {
                System.out.println("+безлимитные социальные сети");
            }
        } else {
            System.out.println("Безлимитный интернет");
        }
        if (myNewTariff.internetAdditionalFeatures != null) {
            System.out.println(myNewTariff.internetAdditionalFeatures);
        }
        if (myNewTariff.minutes > 0) {
            System.out.println(myNewTariff.minutes + " мин.");
        }
        if (myNewTariff.isUnlimitedToTele2) {
            System.out.println("+ безлимит на Tele2 России");
        }
        if (myNewTariff.smsCount > 0) {
            System.out.println(myNewTariff.smsCount + " SMS");
        }
        if (myNewTariff.isCustomizable) {
            System.out.println("Настроить тариф");
        }

    }
}
