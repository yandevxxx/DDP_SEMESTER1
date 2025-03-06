import java.util.*;
public class Help {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String[] arrCharName = {"Speedwagon", "Gojo ", "Bulma", "Choso", "Gon  ", "Guts ", "Araragi", "Sasuke", "Tengen", "Artoria", "Homura", "Usopp", "Dazai", "Asuna", "Tatsumaki"};
        String[] arrCharEvolve = {"(Founder)", "(Six Eyes)", "(Mother)", "(Big Bro)", "(Adult)", "(Berserk)", "(KING)", "(Eternal)", "(Flashiness Master)", "(Avalon le Fae)", "(Magical Girl)", "(God)", "(No Longer Human)", "(Flash)", "(Tornado)"};
        boolean[] arrTypeDamage = {false, true, false, true, true, true, true, true, true, true, true, true, true, true, true};
        boolean[] arrTypeFarm = {true, false, true, false, false, false, false, false, false, false, false, false, false, false, false};
        double[] arrBaseDamage = {0, 300.0, 0, 1500.0, 5000.0, 2500.0, 7000.0, 2000.0, 3000.0, 2300.0, 3200.0, 2000.0, 4500.0, 2200.0, 1900.0};
        double[] arrBaseFarm = {250, 0, 500, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String[] arrCharPrice = {"¥500", "¥1800", "¥800", "¥1200", "¥2000", "¥1600", "¥20000", "¥1200", "¥1500", "¥1100", "¥1400", "¥1000", "¥1800", "¥1450", "¥1000"};
        boolean[] arrSelectedChar = new boolean[15];
        int[] arrPlaceLimit = {3, 3, 1, 4, 1, 3, 1, 4, 3, 4, 3, 5, 2, 3, 5};
        String[] arrParty =  new String[6];
        String[] arrPartyEvolve = new String[6];
        boolean[] arrPartyDmg = new boolean[6];
        boolean[] arrPartyFarm = new boolean[6];
        double[] arrPartyBaseDmg = new double[6];
        double[] arrPartyBaseFarm = new double[6];
        String[] arrPartyPrice = new String[6];
        int[] arrPartyPlaceLimit = new int[6];
        boolean[] arrCharEvolved = {false, false, false, false, false, false};
        boolean[] arrCharTraited = {false, false, false, false, false, false};
        double[] arrPartyDmgBuff =  new double[6];
        double[] arrPartyFarmBuff =  new double[6];
        double[] arrTraitsDmgBuff = {3, 0.4, 0.5, 0};
        String[] arrTraits = {"Unique", "Golden", "Devine", "Celestial"};
        String[] arrTraitsSuccses = {"Unique unit gain 300% damage boost BUT limit the unit placement to 1", "Golden unit gain 40% damage boost for non-farm units, gain extra 15% Yen gain for farm units", "Devine unit gain 50% damage boost", "Celestial unit hace their placement limit double"};
        byte slot, selectActivity, selectChar, selectTraits;
        String yN;
        boolean restart = false;
        System.out.println("=================================================================================================");
        System.out.println("Program AA Tower Defense");
        System.out.println("Dibuat oleh: Azhar Aulia Priatna/1402024013");
        System.out.println("Playable: No");
        System.out.println("=================================================================================================");
        System.out.println("Character List:");
        for(int i = 0 ; i < arrCharName.length ; i++){
            System.out.println((i+1) + ". " + arrCharName[i] + "\t\t" + arrCharPrice[i] + "\t\t" + arrPlaceLimit[i] + " Placement Limit");
        }
        System.out.println("Assemble a party: ");
        for(int i = 0; i < arrParty.length; i++){
            System.out.print("Slot " + (i+1) + ": ");
            slot = userInput.nextByte();
            slot -= 1;
            while(slot > 14){
                System.out.println("Invalid character");
                System.out.print("Slot " + (i+1) + ": ");
                slot = userInput.nextByte();
                slot -= 1;
            }
            if(arrSelectedChar[slot]){
                System.out.println(arrCharName[slot] + " is already in party, please pick another character");
                i--;
            }else{
                arrSelectedChar[slot] = true;
                arrParty[i] = arrCharName[slot];
                arrPartyEvolve[i] = arrCharEvolve[slot];
                arrPartyDmg[i] = arrTypeDamage[slot];
                arrPartyFarm[i] = arrTypeFarm[slot];
                arrPartyBaseDmg[i] = arrBaseDamage[slot];
                arrPartyBaseFarm[i] = arrBaseFarm[slot];
                arrPartyPrice[i] = arrCharPrice[slot];
                arrPartyPlaceLimit[i] = arrPlaceLimit[slot];
                System.out.println(arrParty[i] + " picked");
            }
        }
        System.out.println("=================================================================================================");
        do { 
            System.out.println("Paty List:");
            for(int i = 0 ; i < arrParty.length ; i++){
                System.out.print((i+1) + "." + arrParty[i] + ", ");
            }
            System.out.println("\nActivities");
            System.out.println("1. Play\n2. Traits\n3. Evolve Unit");
            System.out.print("Select Activities: ");
            selectActivity = userInput.nextByte();



            //jika traits
            if (selectActivity == 2) {
                
                System.out.println("=================================================================================================");
                System.out.println("Wich character are you putting traits on?");
                for(int i = 0 ; i < arrParty.length ; i++){
                    System.out.println((i+1) + ". " + arrParty[i]);
                }
                System.out.print("Select a character: ");
                selectChar = userInput.nextByte();
                selectChar--;
                if(!arrCharTraited[selectChar]){
                    
                    System.out.println("=================================================================================================");
                
                    System.out.println("Traits list:");
                    for(int i = 0 ; i < arrTraits.length ; i++){
                        System.out.println((i+1) + ". " + arrTraits[i]);
                    }
                    System.out.print("Select a trait: ");
                    selectTraits = userInput.nextByte();
                    selectTraits -= 1;
                    
                    System.out.println("You are putting " + arrTraits[selectTraits] + " on " + arrParty[selectChar]);
                    System.out.print("Are you sure?(Y/N)");
                    yN = userInput.next();
                    if(yN.equalsIgnoreCase("y")){
                        arrCharTraited[selectChar] = true;
                        arrParty[selectChar] = arrTraits[selectTraits] + " " + arrParty[selectChar];
                            System.out.println("Your " + arrParty[selectChar].substring(arrParty[selectChar].indexOf(" ")) + " has become " + arrParty[selectChar]);
                            System.out.println(arrTraitsSuccses[selectTraits]);
                        if(arrPartyDmg[selectChar] && selectTraits == 1){
                            System.out.println(arrParty[selectChar] + " is not a farm unit, " + arrParty[selectChar] + " will gain 40% damage boost");
                            arrPartyDmgBuff[selectChar] = (arrPartyBaseDmg[selectChar]  * arrTraitsDmgBuff[selectTraits]) + arrPartyBaseDmg[selectChar];
                            System.out.println("Your " + arrParty[selectChar] + " damage has increased from " + arrPartyBaseDmg[selectChar] + " -> " + arrPartyDmgBuff[selectChar]);
                            arrPartyBaseDmg[selectChar] = arrPartyDmgBuff[selectChar]; 
                        }else if(arrPartyFarm[selectChar] && selectTraits == 1){
                            System.out.println(arrParty[selectChar] + " is a farm unit, " + arrParty[selectChar] + " will gain 15% Yen Production");
                            arrPartyFarmBuff[selectChar] = (arrPartyBaseFarm[selectChar]  * 0.15) + arrPartyBaseFarm[selectChar];
                            System.out.println("Your " + arrParty[selectChar] + " Yen Production has increased from " + (int)arrPartyBaseFarm[selectChar] + " -> " + (int)arrPartyFarmBuff[selectChar]);
                            arrPartyBaseFarm[selectChar] = arrPartyFarmBuff[selectChar]; 
                        }else if(selectTraits == 0){
                            arrPartyDmgBuff[selectChar] = (arrPartyBaseDmg[selectChar]  * arrTraitsDmgBuff[selectTraits]) + arrPartyBaseDmg[selectChar];
                            System.out.println("Your " + arrParty[selectChar] + " damage has increased from " + arrPartyBaseDmg[selectChar] + " -> " + arrPartyDmgBuff[selectChar]);
                            arrPartyBaseDmg[selectChar] = arrPartyDmgBuff[selectChar]; 
                            arrPartyPlaceLimit[selectChar] = 1;
                        }else if(selectTraits == 2){
                            arrPartyDmgBuff[selectChar] = (arrPartyBaseDmg[selectChar]  * arrTraitsDmgBuff[selectTraits]) + arrPartyBaseDmg[selectChar];
                            System.out.println("Your " + arrParty[selectChar] + " damage has increased from " + arrPartyBaseDmg[selectChar] + " -> " + arrPartyDmgBuff[selectChar]);
                            arrPartyBaseDmg[selectChar] = arrPartyDmgBuff[selectChar]; 
                        }else if(selectTraits == 3){
                            System.out.println(arrParty[selectChar] + " placement limit has doubled from " + arrPartyPlaceLimit[selectChar] + " -> " + (arrPartyPlaceLimit[selectChar]*2));
                            arrPartyPlaceLimit[selectChar] *= 2;
                        }
                    }
                }else{
                    System.out.println("Character Already Traited");
                }
            //jika evolve
            }else if(selectActivity == 3){
                System.out.println("=================================================================================================");
                System.out.println("Wich character are you evolving?");
                for(int i = 0 ; i < arrParty.length ; i++){
                    System.out.println((i+1) + ". " + arrParty[i]);
                }
                System.out.print("Select a character: ");
                selectChar = userInput.nextByte();
                selectChar--;
                if(!arrCharEvolved[selectChar]){
                    System.out.println("=================================================================================================");
                    // arrCharEvolved[selectChar] = true;
                    System.out.println("Character " + arrParty[selectChar] + " will evolve to " + arrParty[selectChar] + arrPartyEvolve[selectChar] );
                    System.out.print("Are you sure?(Y/N)");
                    yN = userInput.next();
                    if(yN.equalsIgnoreCase("y")){
                            arrCharEvolved[selectChar] = true;
                            arrParty[selectChar] += arrPartyEvolve[selectChar];
                            arrPartyDmgBuff[selectChar] = (arrPartyBaseDmg[selectChar]  * (50.0 / 100)) + arrPartyBaseDmg[selectChar];
                            System.out.println(arrParty[selectChar] + " damage has increased from " +  arrPartyBaseDmg[selectChar] + " -> " + arrPartyDmgBuff[selectChar]);
                            arrPartyBaseDmg[selectChar] = arrPartyDmgBuff[selectChar];
                    }else if(yN.equalsIgnoreCase("n")){
                        System.out.println("Evolution cancelled");
                    }
                }else{
                    System.out.println("Character Already Evolved");
                }
                
            }else{
                System.out.println("Invalid Activity");
            }

            System.out.println("=================================================================================================");
            for(;;){
                System.out.print("Stop The Program? ");
                yN = userInput.next();
                if(yN.equalsIgnoreCase("y")){
                    restart = false;
                    System.out.println("Stopping Program");
                    break;
                }else if(yN.equalsIgnoreCase("n")){
                    restart = true;
                    break;
                }else{
                    System.out.println("invalid");
                }
            }
            System.out.println("=================================================================================================");

        } while (restart);
    }
}




