package ui;

import model.Candidat;
import model.ID;
import model.Sectie;
import repository.CandidatRepository;
import repository.SectieRepository;
import ui.menu.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Consola {

    private MenuCommand mainMenu;
    Scanner scanner = new Scanner(System.in);

    SectieRepository sectieRepository = new SectieRepository(new HashMap<>());
    CandidatRepository candidatRepository = new CandidatRepository(new HashMap<>());

    public Consola(){
    }

    // Sectie

    public void readSectie() {
        System.out.print("Id:");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nume:");
        String nume = scanner.nextLine();
        System.out.print("Nr. loc:");
        int nrLoc = scanner.nextInt();
        sectieRepository.add(new Sectie(new ID(id), nume, nrLoc));
        System.out.println("Section was added.");
    }

    public void updateSectie() {
        System.out.print("Id of section to update:");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nume:");
        String nume = scanner.nextLine();
        System.out.print("Nr. loc:");
        int nrLoc = scanner.nextInt();
        Sectie s = sectieRepository.update(new Sectie(new ID(id), nume, nrLoc));

        if(s != null) {
            System.out.println("Section was updated.");
        } else  {
            System.out.println("No object found with that id.");
        }
    }

    public void removeSectie() {
        System.out.print("Id of section to update:");
        Integer id = scanner.nextInt();
        sectieRepository.delete(new ID(id));
        System.out.println("Section was deleted.");
    }

    // Candidat

    public void readCandidat() {
        System.out.print("Id:");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nume:");
        String nume = scanner.nextLine();
        System.out.print("Telefon:");
        String telefon = scanner.nextLine();
        System.out.print("Mail:");
        String mail = scanner.nextLine();
        System.out.print("Varsta:");
        int varsta = scanner.nextInt();
        candidatRepository.add(new Candidat(new ID(id), nume, telefon, mail, varsta ));
        System.out.println("Candidate was added.");
    }

    public void updateCandidat() {
        System.out.print("Id of candidate to update:");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nume:");
        String nume = scanner.nextLine();
        System.out.print("Telefon:");
        String telefon = scanner.nextLine();
        System.out.print("Mail:");
        String mail = scanner.nextLine();
        System.out.print("Varsta:");
        int varsta = scanner.nextInt();
        candidatRepository.update(new Candidat(new ID(id), nume, telefon, mail, varsta ));
        System.out.println("Candidate was updated.");
    }

    public void removeCandidat() {
        System.out.print("Id of section to update:");
        Integer id = scanner.nextInt();
        sectieRepository.delete(new ID(id));
        System.out.println("Candidate was deleted.");
    }

    private void createMenu() {
        mainMenu = new MenuCommand("\n> Menu Options");
        MenuCommand crudCandidat = new MenuCommand("\n> CRUD Candidat");
        crudCandidat.addCommand("1. Add Candidate", this::readCandidat);
        crudCandidat.addCommand("2. Update Candidate", this::updateCandidat);
        crudCandidat.addCommand("3. Remove Candidate", this::removeCandidat);
        crudCandidat.addCommand("2. Back to main menu", mainMenu);

        MenuCommand crudSectie = new MenuCommand("\n> CRUD Sectie");
        crudSectie.addCommand("1. Add Section", this::readSectie);
        crudSectie.addCommand("2. Update Section", this::updateSectie);
        crudSectie.addCommand("3. Remove Section", this::removeSectie);
        crudSectie.addCommand("4. Back to main menu", mainMenu);

        mainMenu.addCommand("1) Crud Candidat", crudCandidat);
        mainMenu.addCommand("2) Crud Sectie", crudSectie);
        //mainMenu.addCommand("3 Filter ",()-> System.out.println("2 Filter"));
        mainMenu.addCommand("3) Exit" ,()-> { System.exit(0); });
    }

    public void runMenu() {
        createMenu();
        MenuCommand crtMenu = mainMenu;

        while (true) {
            System.out.println(crtMenu.getMenuName());
            System.out.println("------ O P T I O N S ------");
            crtMenu.execute();
            System.out.println("Insert option:");
            int actionNumber = scanner.nextInt();

            if (actionNumber > 0 && actionNumber <= crtMenu.getCommands().size()) {
                Command selectedCommand = crtMenu.getCommands().get(actionNumber - 1);
                if (selectedCommand instanceof MenuCommand)
                    crtMenu = (MenuCommand) selectedCommand;
                else selectedCommand.execute();

            } else System.out.println("Invalid option");
        }
    }
}
