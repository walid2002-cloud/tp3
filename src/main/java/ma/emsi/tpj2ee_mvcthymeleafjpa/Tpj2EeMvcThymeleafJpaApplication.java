package ma.emsi.tpj2ee_mvcthymeleafjpa;
import ma.emsi.tpj2ee_mvcthymeleafjpa.entities.Patient;
import ma.emsi.tpj2ee_mvcthymeleafjpa.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tpj2EeMvcThymeleafJpaApplication implements CommandLineRunner {
    @Autowired
    private  PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Tpj2EeMvcThymeleafJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        patientRepository.save(new Patient(null,"Walid",new Date(),false,96));
        patientRepository.save(new Patient(null,"Vini",new Date(),false,58));
        patientRepository.save(new Patient(null,"Benhalib",new Date(),false,58));
        patientRepository.save(new Patient(null,"CHAMAKH",new Date(),false,99));
        patientRepository.save(new Patient(null,"SAKA",new Date(),false,85));
        patientRepository.save(new Patient(null,"Yassine",new Date(),true,44));
        patientRepository.save(new Patient(null,"Abdo",new Date(),false,14));
        patientRepository.save(new Patient(null,"Slim",new Date(),false,96));



    }
}
