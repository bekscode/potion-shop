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
                healPot.setName("Healing Potion");
                healPot.setInv(10);
                healPot.setPrice(1.50);
                healPot.setId(101);
                healPot.setMinInv(1);
                healPot.setMaxInv(100);


                //save values to repository
                inhousePartRepository.save(healPot);


                //creating the mana potion object from the InhousePart class
                InhousePart manaPot = new InhousePart();

                //setting the values
                manaPot.setName("Mana Potion");
                manaPot.setInv(10);
                manaPot.setPrice(2.50);
                manaPot.setId(102);
                manaPot.setMinInv(1);
                manaPot.setMaxInv(100);


                //save values to repository
                inhousePartRepository.save(manaPot);


                //creating the strength potion object from the InhousePart class
                InhousePart strPot = new InhousePart();

                //setting the values
                strPot.setName("Strength Potion");
                strPot.setInv(10);
                strPot.setPrice(4.50);
                strPot.setId(103);
                strPot.setMinInv(1);
                strPot.setMaxInv(100);


                //save values to repository
                inhousePartRepository.save(strPot);

            }


        //if statement to prevent duplicates when reloading database
        if (outsourcedPartRepository.count() == 0) {
                    //creating the Luck Potion object from the OutsourcedPart class
                    OutsourcedPart osLuck = new OutsourcedPart();

                    //setting the values
                    osLuck.setCompanyName("The Lucky Leprechaun");
                    osLuck.setName("Luck Potion");
                    osLuck.setInv(10);
                    osLuck.setPrice(5.50);
                    osLuck.setId(444);
                    osLuck.setMinInv(1);
                    osLuck.setMaxInv(100);


                    //save values to repository
                    outsourcedPartRepository.save(osLuck);


                    //creating the Stamina Potion object from the OutsourcedPart class
                    OutsourcedPart osStam = new OutsourcedPart();

                    //setting the values
                    osStam.setCompanyName("Dryad Gardens");
                    osStam.setName("Stamina Potion");
                    osStam.setInv(10);
                    osStam.setPrice(10.00);
                    osStam.setId(555);
                    osStam.setMinInv(1);
                    osStam.setMaxInv(100);

                    //save values to repository
                    outsourcedPartRepository.save(osStam);
            }


                //if statement to prevent duplicates when reloading database
                if (productRepository.count() == 0) {

                    //create objects from the Product class
                    Product party_bundle = new Product("Adventuring Party Bundle",45.0, 7);
                    productRepository.save(party_bundle);

                    Product warrior_bundle = new Product("Warrior Bundle", 20.0, 12);
                    productRepository.save(warrior_bundle);

                    Product wizard_bundle = new Product("Wizard Bundle", 25.0, 15);
                    productRepository.save(wizard_bundle);

                    Product ranger_bundle = new Product("Ranger Bundle", 30.0, 5);
                    productRepository.save(ranger_bundle);

                    Product cleric_bundle = new Product("Cleric Bundle", 22.0, 8);
                    productRepository.save(cleric_bundle);


                    System.out.println("Started in Bootstrap");
                    System.out.println("Number of Products" + productRepository.count());
                    System.out.println(productRepository.findAll());
                    System.out.println("Number of Parts" + partRepository.count());
                    System.out.println(partRepository.findAll());
            }
    }
}