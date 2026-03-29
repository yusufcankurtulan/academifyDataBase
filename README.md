# Academify

Academify, akademik ortamda öğretmen-öğrenci etkileşimini yönetmek için geliştirilmiş bir Spring Boot tabanlı web uygulamasıdır. Gerçek zamanlı sohbet, anket sistemi ve kullanıcı profili yönetimi gibi özellikler sunar.

## Özellikler

- **Gerçek Zamanlı Sohbet**: WebSocket kullanarak kullanıcılar arasında anlık mesajlaşma
- **Anket Sistemi**: Öğretmenler için anket oluşturma ve sonuçları görüntüleme
- **Öğretmen Yönetimi**: Öğretmen profillerinin CRUD işlemleri
- **Kullanıcı Profili Yönetimi**: Kullanıcı kayıt, giriş ve şifre sıfırlama
- **H2 Veritabanı**: Gömülü veritabanı ile kolay geliştirme ve test

## Teknolojiler

- **Backend**: Spring Boot 3.2.1, Java 17
- **Veritabanı**: H2 Database
- **WebSocket**: STOMP protokolü ile gerçek zamanlı iletişim
- **Frontend**: HTML, CSS, JavaScript (basit sohbet arayüzü)
- **Build Tool**: Maven
- **Diğer**: Lombok, JPA, Spring Mail

## Gereksinimler

- Java 17 veya üzeri
- Maven 3.6+
- Git

## Güvenlik Özellikleri

Bu proje aşağıdaki güvenlik iyileştirmeleri ile güçlendirilmiştir:

- **Şifre Hashleme**: BCrypt algoritması ile şifreler güvenli bir şekilde hashlenir
- **Spring Security**: Temel authentication ve authorization
- **Input Validation**: Jakarta Bean Validation ile giriş doğrulaması
- **CORS Yapılandırması**: Sadece localhost origin'lerine izin verilir
- **WebSocket Güvenliği**: Allowed origins ile sınırlı bağlantı
- **Logging**: Hassas verilerin loglanmaması için seviye ayarları
- **H2 Console**: Sadece development ortamında aktif

## Kurulum ve Çalıştırma

1. **Projeyi klonlayın**:
   ```bash
   git clone https://github.com/yusufcankurtulan/academifyDataBase.git
   cd academifyDataBase
   ```

2. **Bağımlılıkları indirin**:
   ```bash
   mvn clean install
   ```

3. **Uygulamayı çalıştırın**:
   ```bash
   mvn spring-boot:run
   ```

Uygulama http://localhost:8080 adresinde çalışacaktır.

## Veritabanı

- **H2 Console**: http://localhost:8080/h2-console
- **Bağlantı URL'si**: `jdbc:h2:file:~/test2db`
- **Kullanıcı Adı**: `sa`
- **Şifre**: `as`

## API Endpoint'leri

### Sohbet
- WebSocket endpoint: `/https` (STOMP üzerinden)
- Mesaj gönderme: `/app/chat.sendMessage`
- Kullanıcı ekleme: `/app/chat.addUser`

### Anket
- POST `/api/surveys/submit`: Anket yanıtı gönderme
- GET `/api/surveys/results/{teacherId}`: Anket sonuçlarını görüntüleme

### Öğretmen
- GET `/api/teachers`: Tüm öğretmenleri listeleme

### Kullanıcı Profili
- GET `/api/user-profiles`: Tüm kullanıcı profillerini listeleme
- POST `/api/user-profiles`: Yeni kullanıcı profili oluşturma
- POST `/api/user-profiles/register`: Kullanıcı kayıt
- POST `/api/user-profiles/reset-password`: Şifre sıfırlama

## Kullanım

1. Tarayıcınızda http://localhost:8080 adresine gidin
2. Sohbet için kullanıcı adınızı girin ve "Start Chatting" butonuna tıklayın
3. Mesaj göndermek için mesaj kutusuna yazın ve Enter'a basın

## Proje Yapısı

```
src/
├── main/
│   ├── java/com/example/academify/
│   │   ├── AcademifyApplication.java
│   │   ├── common/
│   │   ├── config/
│   │   │   ├── WebSocketConfig.java
│   │   │   └── WebSocketEventListener.java
│   │   ├── controller/
│   │   │   ├── ChatController.java
│   │   │   ├── SurveyController.java
│   │   │   ├── TeacherController.java
│   │   │   └── UserProfileController.java
│   │   ├── model/
│   │   │   ├── ChatMessage.java
│   │   │   ├── SurveyQuestion.java
│   │   │   ├── Teacher.java
│   │   │   ├── TeacherResponse.java
│   │   │   └── UserProfile.java
│   │   ├── repository/
│   │   │   ├── SurveyQuestionRepository.java
│   │   │   ├── TeacherRepository.java
│   │   │   ├── TeacherResponseRepository.java
│   │   │   └── UserProfileRepository.java
│   │   └── service/
│   │       ├── SurveyService.java
│   │       ├── TeacherService.java
│   │       ├── UserService.java
│   │       └── dto/
│   │           ├── SurveyResponseDto.java
│   │           └── SurveyResultDto.java
│   └── resources/
│       ├── application.properties
│       └── static/
│           ├── index.html
│           ├── css/main.css
│           └── js/main.js
└── test/
    └── java/com/example/academify/
        └── AcademifyApplicationTests.java
```

## Katkıda Bulunma

1. Bu repository'yi fork edin
2. Feature branch oluşturun (`git checkout -b feature/AmazingFeature`)
3. Değişikliklerinizi commit edin (`git commit -m 'Add some AmazingFeature'`)
4. Branch'inizi push edin (`git push origin feature/AmazingFeature`)
5. Pull Request oluşturun

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır.

## İletişim

Yusufcan Kurtulan - yusufcankurtulan@github.com

Proje Linki: [https://github.com/yusufcankurtulan/academifyDataBase](https://github.com/yusufcankurtulan/academifyDataBase)
