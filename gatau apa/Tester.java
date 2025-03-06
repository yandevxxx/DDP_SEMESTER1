if(yN.equalsIgnoreCase("y")){
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
        arrPartyFarmBuff[selectChar] = (arrPartyBaseFarm[selectChar]  * arrTraitsDmgBuff[selectTraits]) + arrPartyBaseFarm[selectChar];
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