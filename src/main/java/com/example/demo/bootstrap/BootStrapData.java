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

            //if statement to prevent duplicates when reloading database
            if (inhousePartRepository.count() == 0) {

                    //creating the healing potion object from the InhousePart class
                    InhousePart healPot = new InhousePart();

                    //setting the values
                    healPot.setId(111);
                    healPot.setName("Healing Potion");
                    healPot.setPrice(1.25);
                    healPot.setInv(10);
                    healPot.setMinInv(1);
                    healPot.setMinInv(100);


                    //save values to repository
                    inhousePartRepository.save(healPot);


                    //creating the mana potion object from the InhousePart class
                    InhousePart manaPot = new InhousePart();

                    //setting the values
                    manaPot.setId(222);
                    manaPot.setName("Mana Potion");
                    manaPot.setPrice(3.50);
                    manaPot.setInv(10);
                    manaPot.setMinInv(1);
                    manaPot.setMaxInv(100);


                    //save values to repository
                    inhousePartRepository.save(manaPot);


                    //creating the strength potion object from the InhousePart class
                    InhousePart strPot = new InhousePart();

                    //setting the values
                    strPot.setId(333);
                    strPot.setName("Strength Potion");
                    strPot.setPrice(4.25);
                    strPot.setInv(10);
                    strPot.setMinInv(1);
                    strPot.setMaxInv(100);


                    //save values to repository
                    inhousePartRepository.save(strPot);


                    //creating the stamina potion object from the InhousePart class
                    InhousePart stamPot = new InhousePart();

                    //setting the values
                    stamPot.setId(444);
                    stamPot.setName("Stamina Potion");
                    stamPot.setPrice(2.75);
                    stamPot.setInv(10);
                    stamPot.setMinInv(1);
                    stamPot.setMaxInv(100);


                    //save values to repository
                    inhousePartRepository.save(stamPot);


                    //creating the luck potion object from the InhousePart class
                    InhousePart luckPot = new InhousePart();

                    //setting the values
                    luckPot.setId(777);
                    luckPot.setName("Luck Potion");
                    luckPot.setPrice(7.77);
                    luckPot.setInv(10);
                    luckPot.setMinInv(1);
                    luckPot.setMaxInv(100);

                    //save values to repository
                    inhousePartRepository.save(luckPot);


                    //creating the flask object from the OutsourcedPart class
                    OutsourcedPart osFlask = new OutsourcedPart();

                    //setting the values
                    osFlask.setCompanyName("Dwarven Glassworks");
                    osFlask.setName("Flask");
                    osFlask.setInv(10);
                    osFlask.setPrice(5.50);
                    osFlask.setId(1L);
                    osFlask.setMinInv(1);
                    osFlask.setMaxInv(100);


                    //save values to repository
                    outsourcedPartRepository.save(osFlask);


                    //creating the herb bundle object from the OutsourcedPart class
                    OutsourcedPart osHerb = new OutsourcedPart();

                    //setting the values
                    osHerb.setCompanyName("Dryad Gardens");
                    osHerb.setName("Herb Bundle");
                    osHerb.setInv(100);
                    osHerb.setPrice(10.00);
                    osHerb.setId(2L);
                    osHerb.setMinInv(1);
                    osHerb.setMaxInv(100);

                    //save values to repository
                    outsourcedPartRepository.save(osHerb);
            }
                //if statement to prevent duplicates when reloading database
                if (productRepository.count() == 0) {

                    //create objects from the Product class
                    Product small_bundle = new Product("Small Adventure Bundle", 10.0, 10);
                    productRepository.save(small_bundle);

                    Product party_bundle = new Product("Adventuring Party Bundle", 25.0, 8);
                    productRepository.save(party_bundle);

                    Product warrior_bundle = new Product("Warrior Bundle", 5.0, 6);
                    productRepository.save(warrior_bundle);

                    Product wizard_bundle = new Product("Wizard Bundle", 10.0, 4);
                    productRepository.save(wizard_bundle);

                    Product ranger_bundle = new Product("Ranger Bundle", 10.0, 5);
                    productRepository.save(ranger_bundle);


                    System.out.println("Started in Bootstrap");
                    System.out.println("Number of Products" + productRepository.count());
                    System.out.println(productRepository.findAll());
                    System.out.println("Number of Parts" + partRepository.count());
                    System.out.println(partRepository.findAll());
            }
    }
}