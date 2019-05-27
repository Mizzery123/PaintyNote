package sg.edu.rp.c346.paintynote;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InfoActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("How To Play?");
        listDataHeader.add("Teams");
        listDataHeader.add("Roles");
        listDataHeader.add("Available Game Modes");

        List<String> edmtDev = new ArrayList<>();
        edmtDev.add("Defend your village from the forces of evil or become a werewolf and hunt your friends!\n" +
                "\n" +
                "Join the mystery game, fight for your team and find the liars among your ranks.\n" +
                "\n" +
                "Werewolf Online is a multiplayer game for up to 16 players. Each game has different teams such as villagers or werewolves all fighting to be the last team standing. Use special abilities to uncover the roles of other players and convince your fellow players to work with you.");

        List<String> androidStudio = new ArrayList<>();

        androidStudio.add("The Village : \n\n" + "The main team in Werewolf Online, holding 10 of 16 players in a full game and 50% of the game's roles (12 of 24 roles).");
        androidStudio.add("The Werewolves : \n\n" +  "The main evil team that is trying to kill the Village team. They start off with more information than the Town, knowing each other. There is a maximum of 4 werewolves per game. Any type of werewolf is not able to be converted to the Sect or bitten by a Zombie.");
        androidStudio.add("Unknown : \n\n" + "This team consist of players that are not from The Villagen or The Werewolves. They can be working solo or as a team.");


        List<String> xamarin = new ArrayList<>();
        xamarin.add("Quick Game: \n\nThe Quick Game is the first game mode, the app will simply pair you up with other players for a simple, quick and easy game, it is great for casual players that wanna know how to play and test out the app.");
        xamarin.add("Ranked Game: \n\nRanked Games, the second game mode, only become playable after you have 35 wins");
        xamarin.add("Custom Game: \n\nCustom games is the 3rd game, you will join a game that has custom roles, which changes up the game quite a bit.");
        xamarin.add("Sandbox Mode: \n\nSandbox mode is a testing mode, in which you can help Philipp and Emanuel fix bugs and help make Werewolf a better game!");

        List<String> uwp = new ArrayList<>();
        uwp.add("SEER: \nA village role.\n\nEach night, the Seer can see the role of one player. ");
        uwp.add("AURA SEER: \nA village role.\n\nEach night the Aura Seer can select one player. They can see whether this player is good, evil or unknown. If the player is good, they are on the village and if they are evil they are on the Werewolves. The Wolf Shaman's enchantment can make an Aura Seer see a player as evil, regardless of their actual aura. ");
        uwp.add("DOCTOR: \nA village role.\n\nEach night the Doctor can select one player to heal. If this player is attacked by the Werewolves, they don't die. The Doctor can heal every night that they are alive. ");
        uwp.add("BODYGUARD: \nA village role.\n\nEach night the Bodyguard can select one player to protect. They also automatically protect themselves. If the Bodyguard or the player they are protecting gets attacked, they will survive. However, if they are attacked again they will die. ");
        uwp.add("PRIEST: \nA village role.\n\nOnce per game, the Priest can throw Holy Water at one player. The Priest makes this action during the day. If the player the Water is thrown at is a Werewolf, they will die (excluding Sorcerer). If that player is not a Werewolf, the Priest dies. ");
        uwp.add("JAILER: \nA village role.\n\nThe jailer can select one player to jail each day. That night, the jailer can talk to their prisoner privately. During this time, that player cannot use their abilities. Once every game, they can execute their prisoner. The Jailer belongs to the village team. ");
        uwp.add("GUNNER: \nA village role.\n\nThe Gunner has no special abilities during the night. During the day, the Gunner has two bullets that it can use. After they use the first bullet, the shot is so loud that everyone knows who the Gunner is. The bullets will kill a player no matter what protection they have. ");
        uwp.add("MEDIUM: \nA village role.\n\nDuring the night, the Medium can talk (anonymously) with dead players. Once per game, they can revive a dead player. ");
        uwp.add("ALPHA WEREWOLF: \nA werewolf role.\n\nThe Alpha Werewolf has the same abilities as a regular Werewolf and can vote on one player to kill each night. However, the when the Alpha Werewolf votes on a player, it gives two votes. ");
        uwp.add("WOLF SEER: \nA werewolf role.\n\nEach night the Wolf Seer can see the role of one player. They can talk with the other Werewolves and provide any information they found. However, the Wolf Seer can not vote on a player to kill unless they resign their ability to see roles. If they are the last Werewolf alive they instantly resign their seeing ability. ");
        uwp.add("JUNIOR WEREWOLF: \nA werewolf role.\n\nEach night the Junior Werewolf can vote on a player to kill like a regular Werewolf. They can also select one player to die with them. They can select this player during any phase of the game. The Junior's selected player will not die if the commit suicide. ");
        uwp.add("HEADHUNTER: \nAn unknown role.\n\nThe Headhunter has no special abilities. On the first night of the game they receive a target on a random village roles. If their target dies in a way other than being lynched, they become a regular villager. ");
        uwp.add("FOOL: \nAn unknown role.\n\nThe Fool has no special abilities besides talking and voting during the day. ");
        uwp.add("SERIAL KILLER: \nAn unknown role.\n\nEach night the Serial Killer can kill one player. They cannot be killed by the Werewolves. However, they are in competition with the werewolves, as both win if they kill enough people. ");
        uwp.add("ARSONIST: \nAn unknown role.\n\nThe Arsonist can choose from two actions to perform each night. They can either douse 2 players in gasoline, or light all ignited players, killing them. The Arsonist cannot be killed by the Werewolves. ");
        uwp.add("SECT LEADER: \nAn unknown role.\n\nEach night, the Sect Leader can select one player to convert to their team, known as the Sect. This player must be from the village team, otherwise they will not be converted. Unturned Cursed does not count. If the Sect Leader dies, every converted player commits suicide. ");
        uwp.add("BOMBER: \nAn unknown role.\n\nAt night, the Bomber can place a bomb which will kill a maximum of 3 players. This bomb can be rotated to kill different players. The following night, the bomb explodes, killing the selected players. The night after that, the bomber can place a new bomb. This process of placing a bomb every two nights continues until the bomber dies. The Bomber cannot be killed by the Werewolves. If it looks like the bomb is placed on yourself you won't die. ");



        listHash.put(listDataHeader.get(0),edmtDev);
        listHash.put(listDataHeader.get(1),androidStudio);
        listHash.put(listDataHeader.get(2),uwp);
        listHash.put(listDataHeader.get(3),xamarin);
    }
}