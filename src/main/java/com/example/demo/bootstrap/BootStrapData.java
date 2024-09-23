package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;


    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inhousePartRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();

        InhousePart ip1 = new InhousePart();
        ip1.setId(111);
        ip1.setName("Healing Potion");
        ip1.setPrice(1.00);
        ip1.setInv(10);
        ip1.setMinInv(1);
        ip1.setMaxInv(100);
        inhousePartRepository.save(ip1);
        InhousePart thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("Healing Potion"))thePart=part;
        }

        InhousePart ip2 = new InhousePart();
        ip2.setId(222);
        ip2.setName("Mana Potion");
        ip2.setPrice(3.00);
        ip2.setInv(10);
        ip2.setMinInv(1);
        ip2.setMaxInv(100);
        inhousePartRepository.save(ip2);
        thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("Mana Potion"))thePart=part;
        }

        InhousePart ip3 = new InhousePart();
        ip3.setId(333);
        ip3.setName("Strength Potion");
        ip3.setPrice(4.00);
        ip3.setInv(10);
        ip3.setMinInv(1);
        ip3.setMaxInv(100);
        inhousePartRepository.save(ip3);
        thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("Strength Potion"))thePart=part;
        }

        InhousePart ip4 = new InhousePart();
        ip4.setId(444);
        ip4.setName("Stamina Potion");
        ip4.setPrice(2.00);
        ip4.setInv(10);
        ip4.setMinInv(1);
        ip4.setMaxInv(100);
        inhousePartRepository.save(ip4);
        thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("Stamina Potion"))thePart=part;
        }

        InhousePart ip5 = new InhousePart();
        ip5.setId(777);
        ip5.setName("Luck Potion");
        ip5.setPrice(7.77);
        ip5.setInv(10);
        ip5.setMinInv(1);
        ip5.setMaxInv(100);
        inhousePartRepository.save(ip2);
        thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("Luck Potion"))thePart=part;
        }


        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            System.out.println(part.getName()+" "+part.getId());
        }


        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();

        OutsourcedPart op1= new OutsourcedPart();
        op1.setCompanyName("Dwarven Glassworks");
        op1.setName("flask");
        op1.setInv(10);
        op1.setPrice(5.00);
        op1.setId(1L);
        op1.setMinInv(1);
        op1.setMaxInv(100);
        outsourcedPartRepository.save(op1);
        OutsourcedPart theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("flask"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        OutsourcedPart op2= new OutsourcedPart();
        op2.setCompanyName("Dryad Gardens");
        op2.setName("herb bundle");
        op2.setInv(100);
        op2.setPrice(10.00);
        op2.setId(2L);
        op2.setMinInv(1);
        op2.setMaxInv(100);
        outsourcedPartRepository.save(op2);
        theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("flask"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }


        Product small_bundle= new Product("Small Adventure Bundle",10.0,10);
        Product party_bundle= new Product("Adventuring Party Bundle",25.0,8);
        Product warrior_bundle= new Product("Warrior Bundle",5.0,6);
        Product wizard_bundle= new Product("Wizard Bundle",10.0,4);
        Product ranger_bundle= new Product("Ranger Bundle",10.0,5);


        productRepository.save(small_bundle);
        productRepository.save(party_bundle);
        productRepository.save(warrior_bundle);
        productRepository.save(wizard_bundle);
        productRepository.save(ranger_bundle);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
