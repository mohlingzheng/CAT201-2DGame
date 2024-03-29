package entity;

import main.GamePanel;

public class NPC_Mother extends Entity{

    public NPC_Mother(GamePanel gp){
        super(gp);
        type = 5;
        direction = "down";
        speed = 1;

        getCharacterImage("npc/mother", "mother", 2);
        setDialogue();
    }

    public void setDialogue(){

        if(conversationState == 0){
            dialogues[0] =  "Mother: \n" +
                            "Traveler, please help me! ";
            dialogues[1] =  "Mother: \n" +
                            "My son ran into the cave because I got mad at \nhim.";
            dialogues[2] =  "Mother: \n" +
                            "I tried to look for him, but I failed.";
            dialogues[3] =  "Mother: \n" +
                            "I am so worried about him.";
            dialogues[4] =  "Mother: \n" +
                            "Please bring him back if you find him.";
        }
        else if(conversationState == 1){
            dialogues[0] =  "Mother: \n" +
                            "Where have you been? I was so \nworried about you.";
            dialogues[1] =  "Son: \n" +
                            "I am so sorry, mom. I got trapped \nin the cave.";
            dialogues[2] =  "Mother: \n" +
                            "I am so sorry that I have been \nmad at you.";
            dialogues[3] =  "Mother: \n" +
                            "Promise me, don’t you ever leave \nme like that again! ";
            dialogues[4] =  "Mother: \n" +
                            "You hear me? I cannot afford to \nlose you, my son.";
            dialogues[5] =  "Son: \n" +
                            "I promise.";
            dialogues[6] =  "Mother: \n" +
                            "Thank you for your help, traveler.";
            dialogues[7] =  "Son: \n" +
                            "Thank you, sir.";
        }

    }

    public void setAction(){



    }
    public void speak(){
        setDialogue();
        super.speak();
    }
}
