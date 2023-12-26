
import javax.swing.*;


public class AdamAsmaca extends javax.swing.JFrame {
    int count = 0;

    public AdamAsmaca() {
        initComponents();
        //Ekran Boyutunun Değiştirilmesine Engel Olur
        setResizable(false);
    }

    private String secilenKelime;
    private char[] gizlenenHarfler;
    String[] dizi = new String[]{"ADANA", "ADIYAMAN", "AFYONKARAHİSAR", "AĞRI", "AMASYA", "ANKARA", "ANTALYA", "ARTVİN",
            "AYDIN", "BALIKESİR", "BİLECİK", "BİNGÖL", "BİTLİS", "BOLU", "BURDUR", "BURSA", "ÇANAKKALE", "ÇANKIRI", "ÇORUM",
            "DENİZLİ", "DİYARBAKIR", "EDİRNE", "ELAZIĞ", "ERZİNCAN", "ERZURUM", "ESKİŞEHİR", "GAZİANTEP", "GİRESUN", "GÜMÜŞHANE",
            "HAKKARİ", "HATAY", "ISPARTA", "MERSİN", "İSTANBUL", "İZMİR", "KARS", "KASTAMONU", "KAYSERİ", "KIRIKKALE", "KIRKLARELİ",
            "KIRŞEHİR", "KOCAELİ", "KONYA", "KÜTAHYA", "MALATYA", "MANİSA", "KAHRAMANMARAŞ", "MARDİN", "MUĞLA", "MUŞ", "NEVŞEHİR",
            "NİĞDE", "ORDU", "RİZE", "SAKARYA", "SAMSUN", "SİİRT", "SİNOP", "SİVAS", "TEKİRDAĞ", "TOKAT", "TRABZON", "TUNCELİ",
            "ŞANLIURFA", "UŞAK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "ŞIRNAK",
            "BARTIN", "ARDAHAN", "IĞDIR", "YALOVA", "KARABÜK", "KİLİS", "OSMANİYE"};

    //Dizi içerisnden Şehir seçer.
    public static String sehirSec(String[] dizi) {
        int rnd = (int) (Math.random() * dizi.length);
        String secilmis = dizi[rnd];
        return secilmis;
    }

    //Secilen Şehri '_' ile gizler
    public static char[] sehirGiz(int uzunluk) {
        char[] yenidizi = new char[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            yenidizi[i] = '_';
        }
        return yenidizi;
    }

    //Eğer klavyeden girilen değer seçilen şehirin içerisinde varsa o indeks'deki elemanları açar
    public static char[] sehirAc(char[] yenidizi, char secKar, String secilmis) {
        for (int i = 0; i < secilmis.length(); i++) {
            if (secilmis.charAt(i) == secKar) {
                yenidizi[i] = secKar;
            }
        }
        return yenidizi;
    }

    //Gizlenen Harf Kalıp Kalmadığını Kontrol Eder.
    private boolean sehirBittiMi(char[] gizlenenHarfler) {
        for (char harf : gizlenenHarfler) {
            if (harf == '_') {
                return false;
            }
        }
        return true;
    }

    //GUI Ayarlan Komutlar
    private void initComponents() {

        btnNewGame = new javax.swing.JButton();
        btnTahmin = new javax.swing.JButton();
        textInput = new javax.swing.JTextField();
        lblShowStatus = new javax.swing.JLabel();
        lblShowText = new javax.swing.JLabel();
        lblShowInf = new javax.swing.JLabel();
        lblKalanSayac = new javax.swing.JLabel();
        lblKoruganImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adam Asmaca Oyunu");

        btnTahmin.setText("Tahmin Et");
        btnTahmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTahminActionPerformed(evt);
            }
        });


        btnNewGame.setText("Yeniden Başla");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTahmin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblShowStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(btnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblKalanSayac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(lblKoruganImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblShowInf, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblShowText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                                .addComponent(lblShowStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(lblShowInf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblKoruganImg, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNewGame)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblKalanSayac)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTahmin)
                                        .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }

    //Oyunu Sıfırlayarak Yeniden Başlatır
    private void oyunuYenidenBaslat() {
        secilenKelime = sehirSec(dizi);
        gizlenenHarfler = sehirGiz(secilenKelime.length());
        count = 0;
        String gizliKelime = "";
        for (char harf : gizlenenHarfler) {
            gizliKelime = gizliKelime + harf;
        }
        lblShowText.setText(gizliKelime.toString());
        lblShowStatus.setIcon(null);
        textInput.setText("");
        guncelleKalanHak();
    }

    //Yeniden Başlat Tuşuna Tıklanırsa Oyunu Yeniden Başlatır
    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {
        oyunuYenidenBaslat();
    }

    private void btnTahminActionPerformed(java.awt.event.ActionEvent evt) {
        //Kullanıcıdan Harf Alır Ve Bunu Büyük Harfe Çevirir
        String text = textInput.getText().toUpperCase();
        //Alınan Girdinin Uzunluğunu Kontrol Eder.
        if (text.length() == 1) {
            //Eğer Uzunlugu 1 İse Girdi Olarak Alır Ve Harf Eğer Seçilen Şehirin içinde varsa ilgili bölümleri açar ve ekranda yazar
            char tahminHarfi = text.charAt(0);
            gizlenenHarfler = sehirAc(gizlenenHarfler, tahminHarfi, secilenKelime);
            String gizliKelime = "";
            for (char harf : gizlenenHarfler) {
                gizliKelime = gizliKelime + harf;
            }
            lblShowText.setText(gizliKelime);
            //Eğer Açılacak Harf Kalmadıysa if Bloğunun İçine girer ve panel açarak kullanıcıya Kazandığının mesajını vererek Ekrana Mutlu Ördek Getirir.
            if (sehirBittiMi(gizlenenHarfler)) {
                ImageIcon icon = new ImageIcon("C:\\javademos\\adamAsmaca\\src\\images\\duck.png");
                JLabel label = new JLabel(icon);
                String message = "Tebrikler! Kelimeyi buldunuz: " + secilenKelime;
                JPanel panel = new JPanel();
                panel.add(new JLabel(message));
                panel.add(label);
                JOptionPane.showMessageDialog(null, panel, "Bildirim", JOptionPane.PLAIN_MESSAGE);
                oyunuYenidenBaslat();
                return;
            }
            //Eğer Girilen Harf Şehirin içerisinde yoksa Adamı Asmaya Başlar ve count değerini 1 arttırır, kalan hak sayısını günceller(Oyun Yeniden Başlar)
            if (yanlisTahminYaptiMi(tahminHarfi)) {
                ImageIcon img = new ImageIcon("C:\\javademos\\adamAsmaca\\src\\images\\" + count + ".jpg");
                lblShowStatus.setIcon(img);
                count++;
                guncelleKalanHak();
            }
            //Eğer Adam Asıldıysa(Kullanıcın Hakkı Bittiyse) Ekrana Kullanıcın Kaybettiğine Dair Bir Mesaj ve Üzgün Ördek Görselini verir(Oyun Yeniden Başlar)
            if (count == 7) {
                ImageIcon icon = new ImageIcon("C:\\javademos\\adamAsmaca\\src\\images\\sadDuck.jpg");
                JLabel label = new JLabel(icon);
                String message = "Maalesef Kelimeyi Bulamadınız: " + secilenKelime;
                JPanel panel = new JPanel();
                panel.add(new JLabel(message));
                panel.add(label);
                JOptionPane.showMessageDialog(null, panel, "Bildirim", JOptionPane.PLAIN_MESSAGE);
                oyunuYenidenBaslat();
                return;
            }
            //Eğer Harf Uzunluğu 1'den Fazlaysa Kullanıcya Uyarı vererek Harf Girmesini İster.
        } else {
            JOptionPane.showMessageDialog(null, "Lütfen tek bir harf girin.");
        }
        textInput.setText("");
    }

    //Kullanıcın Yanlış Tahmin Yapıp Yapmadığını Kontrol Eder.
    private boolean yanlisTahminYaptiMi(char tahminHarfi) {
        boolean yanlisTahmin = true;
        gizlenenHarfler = sehirAc(gizlenenHarfler, tahminHarfi, secilenKelime);

        for (char harf : gizlenenHarfler) {
            if (harf == tahminHarfi) {
                yanlisTahmin = false;
                break;
            }
        }
        return yanlisTahmin;
    }


    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdamAsmaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdamAsmaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdamAsmaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdamAsmaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdamAsmaca frame = new AdamAsmaca();
                frame.getLblShowText();
                frame.setVisible(true);
                frame.getLblShowInf();
                frame.getLblKalanSayac();
                frame.getLblKoruganImg();
            }
        });
    }

    //Github Adresini Ekranda Gösterir
    private void getLblShowInf() {
        lblShowInf.setText("github.com/Korugan32 27.12.23");
    }

    //Ekranda Kaç Hakkın Kaldığını Gösterir
    private void getLblKalanSayac() {
        guncelleKalanHak();
    }

    //Yanlış Tahmin Olursa Kalan Hakkı Günceller
    private void guncelleKalanHak() {
        lblKalanSayac.setText("Kalan Hakkınız = " + (7 - count));
    }

    //Seçilen Şehri Alır,Gizlenen Ve Açılan Harfleri Bir Araya Getirerek Ekrana Verir
    public JLabel getLblShowText() {
        secilenKelime = sehirSec(dizi);
        gizlenenHarfler = sehirGiz(secilenKelime.length());
        String gizliKelime = "";
        for (char harf : gizlenenHarfler) {
            gizliKelime = gizliKelime + harf;
        }
        lblShowText.setText(gizliKelime.toString());
        return lblShowText;
    }

    //Ekrandaki Büyük Ördeği Gösterir :)
    private void getLblKoruganImg() {
        ImageIcon icon = new ImageIcon("C:\\javademos\\adamAsmaca\\src\\images\\duck.png");
        lblKoruganImg.setIcon(icon);
    }


    //Buton Tanımlamaları
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnTahmin;
    private javax.swing.JLabel lblShowInf;
    private javax.swing.JLabel lblShowText;
    private javax.swing.JLabel lblShowStatus;
    private javax.swing.JTextField textInput;
    private javax.swing.JLabel lblKalanSayac;
    private javax.swing.JLabel lblKoruganImg;

}

