package miniheroproject.data;

/**
 * Import the hero card blue prints from the hero data package
 */

/**
 * Import the java utility ArrayList tool to be able to use it.
 */
import java.util.ArrayList;

/**
 * @author Krypton
 */
public class HeroList {

    /**
     * Creates a new object from the HeroCard class 
     * as an array list called cardHolder
     */
    ArrayList<HeroCard> cardHolder = new ArrayList<>();
    
    
    /**
     * Define a new method with ArrayList as the type
     * 
     * @return After adding all the heroes to the array list 
     * it returns the cardHolder itself
     */
    public ArrayList<HeroCard> getHeroes(){
        
        cardHolder.add(new HeroCard("Apocalypse", "En Sabah Nuh", 0, 8, 50, 16, 22, 80,
                "Born into slavery at the dawn of civilisation, the mutant warlord also "
                + "known \nas En Sabah Nur lives by a merciless philosophy: survival of the fittest.\n"
                + "Only through conflict and strife will the weak be culled from the strong,\n"
                + "and only the strong deserve to survive. War. Plague. Pestilence.\n"
                + "These are his tools. And with them, he means to rule the world!", "apocalypse.jpg"));

        cardHolder.add(new HeroCard("Black Panther", "T'Challa", 180, 7, 29, 7, 17, 79,
                "With the sleekness of the jungle cat whose name he bears. T'Challa,\n"
                + "King of Wakanda, stalks both the concrete city and the undergrowth\n"
                + "of the Veldt. So it has been for countless generations of warrior kings,\n"
                + "so it is today, and so it shall be - for the law dictates that only the \n"
                + "swift, the smart and the strong survive. \nNoble champion. Vigilant protector. Black Panther!", "black-panther.jpg"));
        
        
        cardHolder.add(new HeroCard("Black Widow", "Natasha Romanov", 168, 4, 26, 4, 14, 81,
                "Natasha Romanov is the quintessential spy who came in from the "
                + "cold. \nFormerly an agent of the Soviet Union, the felonious femme\n"
                + "fatale tangled with a number of heroes including Iron Man, Hawkeye,\n"
                + "Nick Fury, Spider-Man and Daredevil. Now, the Black Widow uses\n"
                + "her amazing acrobatic abilities and fearsome fighting skills for good.\n"
                + "Lured by her beauty, many a man has felt the Widow's Sting!", "black-widow.jpg"));

        cardHolder.add(new HeroCard("Blade", "Unrevealed", 185, 3, 29, 5, 14, 85,
                "The tortured warrior known only as Blade may be humanity's last,\n"
                + "best hope for survival against an army of immortal vampires. \nRendered "
                + "immune to a vampire's bite by the circumstances of his birth, \nhe has "
                + "sharpened his combat skills to a lethal edge. \nFuelled by a craving for "
                + "vengeance, Blade fights alone \nand alongside his fellow hunters to "
                + "wipe vampires off the face of the Earth!", "blade.jpg"));

        cardHolder.add(new HeroCard("Captain America", "Steve Rogers", 186, 4, 29, 6, 16, 86,
                "In 1940, as America prepared for war, a frail young man volunteered\n"
                + "for an experiment that transformed him into the ultimate physical\n"
                + "specimen: the American Super-Soldier. Steve Rogers battled Nazis\n"
                + "until a freak mishap placed him in a suspended animation for decades.\n"
                + "When he awakened, Rogers was truly a man out of time, though no\n"
                + "less committed to fighting the evils of this perilous new era!", "captain-america.jpg"));

        cardHolder.add(new HeroCard("Dr Doom", "Victor Von Doom", 186, 8, 48, 4, 13, 70,
                "A brilliant but arrogant scientist, Victor Von Doom was disfigured\n"
                + "when one of his early experiments went horribly awry. \nDr.Doom "
                + "rules the small European country of Latveria with an iron fist. \nNot "
                + "content with one nation, his ultimate aspiration is world "
                + "domination...\nand the destruction of the fabled Fantastic Four!", "dr-doom.jpg"));

        cardHolder.add(new HeroCard("Dr Octopus", "Dr Otto Octavius", 173, 7, 23, 2, 12, 65,
                "Armed with a bevy of bone-crushing steel tentacles, \nDr.Octopus has "
                + "dedicated his warped genius \nto the eradication of his most hated foe: "
                + "the Amazing Spider-Man! \nDr.Octopus abilities derive from his four steel "
                + "tentacles. \nAttached to a harness encircling his lower chest and waist,\n"
                + "each telepathically controlled, telescopic limb can move at speeds of\n"
                + "up to 90 feet per second and strike with the force of a jackhammer.", "dr-octopus.jpg"));

        cardHolder.add(new HeroCard("Dr Strange", "Dr Stephen Strange", 184, 5, 35, 4, 14, 85,
                "Former surgeon Stephen Strange is now Master of the Mystic Arts\n"
                + "and Earth's Sorcerer Supreme. Aided by a magical Cloak of Levitation\n"
                + "and the all-seeing Eye of Agamotto, Strange battles the hidden forces "
                + "of evil. \nWhen extraordinary events occur and the inexplicable "
                + "becomes commonplace, \nrest assured: the doctor is in the house!", "dr-strange.jpg"));

        cardHolder.add(new HeroCard("Elektra", "Elektra Natchios", 173, 4, 15, 6, 16, 80,
                "Assassin. Lover. Enigma. Driven by tragedy and honed by training,\n"
                + "the femme fatale known as Elektra kills for hire, loves for trills...\nand "
                + "leaves destruction in her wake! \nAlthough she possesses no "
                + "superhuman abilities, \nElektra is a consummate practitioner of the "
                + "martial arts. \nShe is a mistress of the skills of the ancient ninja of "
                + "Japan, \nand an Olympic-level athlete and gymnast.", "elektra.jpg"));

        cardHolder.add(new HeroCard("Ghost Rider", "Johnny Blaze", 181, 3, 37, 8, 15, 66,
                "When innocent blood is spilled, bad-boy biker John Blaze find himself\n"
                + "transformed into a skeletal fire demon thundering through the night\n"
                + "on a mystical motorcycle of pure hellfire. \nAs Ghost Rider, he avenges "
                + "souls tarnished by the touch of evil.", "ghost-rider.jpg"));

        cardHolder.add(new HeroCard("Green Goblin", "Norman Osborn II", 178, 6, 35, 10, 18, 55,
                "The Green Goblin's real name is Norman Osborn II. \nA professional "
                + "criminal, and former owner and president of Osborn Industries, \nhe "
                + "has been Spider-Man's greatest enemy since the beginning. A "
                + "maniacal \nmanifestation of Norman Osborn's chemically induced "
                + "insanity, the Green Goblin\nhas done more than any other villain to "
                + "wreck the web-slinger's world.", "green-goblin.jpg"));

        cardHolder.add(new HeroCard("HawkEye", "Clint Barton", 188, 3, 26, 4, 16, 80,
                "Once upon a time, outlaw-turned-adventures Clint Barton \nwas a valued "
                + "member of the Avengers, Earth's Mightiest Heroes \nunited to fight "
                + "the foes no single hero could withstand. \nDissatisfied with his role on "
                + "the team, the master marksman parted ways \nwith the planet's foremost "
                + "defenders to help reform the wayward Thunderbolts, \nforsaking his "
                + "fairy-tale existence for life outside the law!", "hawkeye.jpg"));

        cardHolder.add(new HeroCard("IceMan", "Bobby Drake", 170, 3, 28, 4, 12, 70,
                "There's one in every class: a joker with amazing gifts, \nbut lacking the "
                + "ambition to tap his true potential. \nOne of the Professor Charles Xavier's "
                + "original students. \nBobby Drake found out the hard way that he still "
                + "had a lot to learn. \nBut once he glimpsed the full extent of his mutant "
                + "power \nthe freeze water molecules, Iceman returned to the X-men \nwith "
                + "evolution on his mind!", "iceman.jpg"));

        cardHolder.add(new HeroCard("Invisible Woman", "Susan Richards", 165, 3, 23, 2, 12, 70,
                "Once an aspiring actress, Susan Richards instead found worldwide\n "
                + "fame as a member of the legendary Fantastic Four. But this Invisible\n "
                + "Woman isn't about to fade into the background! Bathed in cosmic\n "
                + "radiation during a fateful trip into space with her three friends, Sue\n "
                + "continues to develop her powers and play an active role in the team's leadership.", "invisible-woman.jpg"));

        cardHolder.add(new HeroCard("Iron Man", "Tony Stark", 183, 6, 48, 2, 12, 85,
                "Gravely injured by an act of industrial sabotage, billionaire genius Tony\n "
                + "Stark saved his own life by designing a life-sustaining shell - the hi-tech\n "
                + "armour that makes him the invincible Iron Man. Today, the world thinks\n "
                + "Iron Man is Stark's personal bodyguard. In this dual role, he faces corporate\n "
                + "intrigue and super-powered menaces. Iron Man is a modern-day knight\n "
                + "in shining armour, fighting injustice wherever it rears its ugly head!", "iron-man.jpg"));

        cardHolder.add(new HeroCard("Juggernaut", "Cain Marko", 205, 3, 48, 2, 10, 63,
                "Cain Marko is a human juggernaut. Once the juggernaut begins moving in\n"
                + "a certain direction, no power on Earth can stand in his way. A mystically\n"
                + "empowered human, Juggernaut has long harboured resentment toward\n"
                + "his stepbrother, Charles Xavier - the mentor of the masked, mutant X-Men.\n"
                + "He has clashed with his stepbrother's heroic charges repeatedly through\n"
                + "the years - but on occasion, he's also been called upon to save the universe!", "juggernaut.jpg"));

        cardHolder.add(new HeroCard("Kingpin", "Wilson Fisk", 198, 7, 30, 4, 13, 75,
                "A self-made mass of muscle, Wilson Fisk knows no equal. Using his\n "
                + "immense size and strength, he reached the pinnacle of his chosen\n "
                + "profession by relying on just one person: himself. The infamous Kingpin\n "
                + "of Crime rules the East Coast underworld with an iron hand - and zero\n "
                + "tolerance for failure!", "kingpin.jpg"));

        cardHolder.add(new HeroCard("Magneto", "Magnus", 185, 8, 46, 2, 12, 81,
                "Once a close friend of mutant mentor Charles Xavier, the genetic terrorist\n "
                + "known as Magneto is now his deadliest foe. The self-anointed Master\n "
                + "of Magnetism has dedicated his life to the ascendance of mutant-kind.\n "
                + "Arguably the most powerful man on Earth, Magneto believes that\n "
                + "mutants represent the next step in human evolution and has grown\n "
                + "weary of waiting for Homo sapiens to cede control of the planet!", "magneto.jpg"));

        cardHolder.add(new HeroCard("Mr Fantastic", "Reed Richards", 183, 9, 23, 2, 22, 65,
                "Mr.Fantastic is capable of converting his body into a highly malleable\n "
                + "state at will. As such, he can stretch, deform, expand or compress\n "
                + "himself into any shape he can imagine. Celebrated around the world\n "
                + "as much for his brilliant mind as his stretching abilities, Reed Richards\n "
                + "commands the respect of his peers and family as leader of the fabulous\n "
                + "Fantastic Four!", "mr-fantastic.jpg"));

        cardHolder.add(new HeroCard("Mysterio", "Quentin Beck", 178, 3, 23, 3, 14, 70,
                "A master magician and hypnotist, Mysterio could perform multiple sleights of\n "
                + "hand simultaneously. Quentin Beck began his career as a movie stuntman, but\n "
                + "soon developed a singular interest in the field of motion picture special effect.\n "
                + "Motivated by a desire for recognition, a friend's joking suggestion set in motion\n "
                + "his efforts to kill Spider-Man and take his place as a popular crimefighter.", "mysterio.jpg"));

        cardHolder.add(new HeroCard("Nick Fury", "Nick Fury", 183, 3, 27, 4, 12, 86,
                "Nick Fury worked his way up the U.S intelligence ladder on the strength\n "
                + "of his deeds, brains and integrity. Kept in the peak of youthful vigour\n "
                + "by the mysterious Infinity Formula, the secret agent has done it all:\n "
                + "from wooing wicked women to skydiving while smoking a cigar. When\n "
                + "the free world has its back to the wall, Nick Fury, Agent of S.H.I.E.L.D.\n "
                + "is the man most likely to come out fighting!", "nick-fury.jpg"));

        cardHolder.add(new HeroCard("Professor X", "Charles Xavier", 180, 7, 24, 1, 12, 64,
                "The world's most powerful telepath, Charles Xavier possesses vast\n "
                + "psionic abilities. He can induce illusions, temporary mental or physical\n "
                + "paralysis, loss of specific memories, or total amnesia, project mind-\n "
                + "numbing mental bolts, and sense the presence of mutants within a\n "
                + "small radius. Other abilities including telekinesis and astral projection.", "professor-x.jpg"));

        cardHolder.add(new HeroCard("Silver Surfer", "Norrin Radd", 190, 4, 46, 13, 18, 72,
                "Desperate to deliver his homeworld from certain destruction, Norrin\n "
                + "Radd struck a deal with the fundamental force of nature known as\n "
                + "Galactus. As the world-devourer's herald, he would search the galaxy\n "
                + "for his master's sustenance. Eventually breaking his bonds, the Silver\n "
                + "Surfer now soars the cosmic waves unshackled as the Lone Sentinel\n "
                + "of the Spaceways!", "silver-surfer.jpg"));

        cardHolder.add(new HeroCard("Spider-Man", "Peter Park", 175, 7, 36, 11, 21, 66,
                "The bite of an irradiated spider granted high-school student Peter Parker\n "
                + "incredible, arachnid-like powers. When a burglar killed his beloved Uncle\n "
                + "Ben, a grief-stricken Peter vowed to use his amazing abilities to protect\n "
                + "his fellow man, Spider-Man possesses superhuman strength, reflexes\n "
                + "and equilibrium: the ability to cling to most surfaces: and a sixth sense\n "
                + "that warns him of impending danger.", "spiderman.jpg"));

        cardHolder.add(new HeroCard("Storm", "Ororo Munroe", 178, 4, 27, 12, 14, 69,
                "Orphaned as a child, Ororo Munroe developed the power to command\n "
                + "the forces of nature - and once was worshipped as a goddess in\n "
                + "Africa for that very reason. As a member of the X-Men, she wields\n "
                + "her unique genetic gifts to protect a world that hates and fears\n "
                + "mutants!", "storm.jpg"));

        cardHolder.add(new HeroCard("The Beast", "Hank McCoy", 177, 5, 35, 10, 20, 72,
                "Hank McCoy not only possesses superhuman agility, strength, speed,\n "
                + "endurance and dexterity - he's also a world-renowned biochemist.\n "
                + "As a member of the X-Men, the blue-furred Beast has dedicated the\n "
                + "totality of his physical gifts and scientific genius to the creation of a\n "
                + "better world for man and mutant!", "the-beast.jpg"));

        cardHolder.add(new HeroCard("The Human Torch", "Johnny Storm", 175, 4, 26, 5, 14, 71,
                "Mutagenically transformed by cosmic rays into the heroic Human\n "
                + "Torch, Johnny Storm is the hothead of the Fantastic Four. Often\n "
                + "impetuous and immature, the Torch has a talent for tormenting his\n "
                + "teammate, the Thing - when he's not chasing skirt in one of his souped-\n "
                + "up hot rods!", "the-human-torch.jpg"));

        cardHolder.add(new HeroCard("The Thing", "Ben Grimm", 180, 3, 47, 8, 12, 85,
                "Once a skilled fighter pilot, Ben Grimm is now the Thing, a member\n "
                + "of the world-famous Fantastic Four. Bathed in cosmic radiation during\n "
                + "a fateful trip into space with his three friends, Ben was transformed\n "
                + "into a hideous creature of craggy, orange stone with superhuman\n "
                + "strength.", "the-thing.jpg"));

        cardHolder.add(new HeroCard("Thor", "Jake Olson", 195, 4, 49, 9, 19, 85,
                "He is the Norse God of Thunder, master of the storm and lightning,\n "
                + "heir to the throne of legendary Asgard. Summoning the enchanted\n "
                + "Uru hammer Mjolnir, EMS technician Jake Olson stands transformed\n "
                + "into the mightiest warrior of mythology: Thor!", "thor.jpg"));

        cardHolder.add(new HeroCard("Venom", "Eddie Brock", 188, 3, 38, 10, 20, 64,
                "Venom is an amalgamation of two beings: Eddie Brock, a human whose\n "
                + "career as a reporter for the Daily Globe came to an abrupt end when\n "
                + "Spider-Man unwittingly exposed a story he had written as a false: and\n "
                + "the alien symbiote that posed for a time as Spider-Man's black costume,\n "
                + "until the wall-crawler realised it was alive and rejected it.", "venom.jpg"));

        return cardHolder;
    }
}
