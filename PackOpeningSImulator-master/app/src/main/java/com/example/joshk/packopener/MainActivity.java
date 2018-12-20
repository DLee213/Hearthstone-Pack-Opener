package com.example.joshk.packopener;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Collections;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int dustValue;
    private int craftCost;
    private int clicked = 0;
    private int c1, c2, c3, c4, c5 = 0;
    private int ifRare = 0;
    private ArrayList<Integer> common = new ArrayList<>();
    private ArrayList<Integer> rare = new ArrayList<>();
    private ArrayList<Integer> epic = new ArrayList<>();
    private ArrayList<Integer> legendary = new ArrayList<>();
    private ArrayList<Integer> d = new ArrayList<>();
    private Button card1;
    private Button card2;
    private Button card3;
    private Button card4;
    private Button card5;
    private Button next;
    private TextView craft;
    private TextView dust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        wireWidgets();

        dustValue = 0;
        craftCost = 0;
        craft.setText("Craft Cost: " + craftCost);
        dust.setText("Dust Value: " + dustValue);

        addCards();


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c1 == 0) {
                    revealCard(card1);
                    c1 = 1;
                }
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c2 == 0) {
                    revealCard(card2);
                    c2 = 1;
                }
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c3 == 0) {
                    revealCard(card3);
                    c3 = 1;
                }
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c4 == 0) {
                    revealCard(card4);
                    c4 = 1;
                }
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c5 == 0) {
                    revealCard(card5);
                    c5 = 1;
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Refresh", Toast.LENGTH_SHORT).show();
                if (clicked >= 5) {
                    dustValue = 0;
                    craftCost = 0;
                    craft.setText("Craft Cost: " + craftCost);
                    dust.setText("Dust Value: " + dustValue);
                    c1 = 0;
                    c2 = 0;
                    c3 = 0;
                    c4 = 0;
                    c5 = 0;
                    card1.setBackgroundResource(R.drawable.cardback);
                    card2.setBackgroundResource(R.drawable.cardback);
                    card3.setBackgroundResource(R.drawable.cardback);
                    card4.setBackgroundResource(R.drawable.cardback);
                    card5.setBackgroundResource(R.drawable.cardback);
                    clicked = 0;
                    ifRare = 0;
                }
            }
        });
    }

    private void addCards() {
        //erase these but use it as an example
        //add each card to the rarity they belong in ex:  malygos in legendary
        common.add(R.drawable.abusive_sergreant);
        common.add(R.drawable.acolyte_of_pain);
        common.add(R.drawable.amani_berserker);
        common.add(R.drawable.ancient_brewmaster);
        common.add(R.drawable.arathi_weaponsmith);
        common.add(R.drawable.argent_protector);
        common.add(R.drawable.argent_squire);
        common.add(R.drawable.battle_rage);
        common.add(R.drawable.betrayal);
        common.add(R.drawable.blessing_of_wisdom);
        common.add(R.drawable.blood_imp);
        common.add(R.drawable.bloodsaid_raider);
        common.add(R.drawable.call_of_the_void);
        common.add(R.drawable.cirlce_of_healing);
        common.add(R.drawable.cold_blood);
        common.add(R.drawable.cone_of_cold);
        common.add(R.drawable.cruel_taskmaster);
        common.add(R.drawable.cult_master);
        common.add(R.drawable.dark_iron_dwarf);
        common.add(R.drawable.deadly_shot);
        common.add(R.drawable.defias_ringleader);
        common.add(R.drawable.demonfire);
        common.add(R.drawable.dire_wolf_alpha);
        common.add(R.drawable.dread_corsair);
        common.add(R.drawable.druid_of_the_claw);
        common.add(R.drawable.dust_devil);
        common.add(R.drawable.earth_shock);
        common.add(R.drawable.earthen_ring_farseer);
        common.add(R.drawable.eviscerate);
        common.add(R.drawable.explosivetrap);
        common.add(R.drawable.eyeforan_eye);
        common.add(R.drawable.faerie_dragon);
        common.add(R.drawable.fen_creeper);
        common.add(R.drawable.flame_imp);
        common.add(R.drawable.flesheating_ghoul);
        common.add(R.drawable.forked_lightning);
        common.add(R.drawable.freezing_trap);
        common.add(R.drawable.frost_elemental);
        common.add(R.drawable.harvest_golem);
        common.add(R.drawable.ice_barrier);
        common.add(R.drawable.inner_fire);
        common.add(R.drawable.inner_rage);
        common.add(R.drawable.iron_beak_owl);
        common.add(R.drawable.jungle_panther);
        common.add(R.drawable.leper_gnome);
        common.add(R.drawable.lightning_bolt);
        common.add(R.drawable.lightspawn);
        common.add(R.drawable.loot_hoarder);
        common.add(R.drawable.mad_bomber);
        common.add(R.drawable.mana_wyrm);
        common.add(R.drawable.mark_of_nature);
        common.add(R.drawable.mirror_entity);
        common.add(R.drawable.mogu_shanwarden);
        common.add(R.drawable.naturalize);
        common.add(R.drawable.noble_sacrifice);
        common.add(R.drawable.pilfer);
        common.add(R.drawable.power_of_the_wild);
        common.add(R.drawable.priestess_of_elune);
        common.add(R.drawable.raging_worgen);
        common.add(R.drawable.rampage);
        common.add(R.drawable.redemption);
        common.add(R.drawable.repentance);
        common.add(R.drawable.scarlet_crusader);
        common.add(R.drawable.scavenging_hyena);
        common.add(R.drawable.sense_demons);
        common.add(R.drawable.shadowstep);
        common.add(R.drawable.shieldbearer);
        common.add(R.drawable.silence);
        common.add(R.drawable.silver_hand_knight);
        common.add(R.drawable.silvermoon_guardian);
        common.add(R.drawable.slam);
        common.add(R.drawable.snipe);
        common.add(R.drawable.sorcerer_s_apprentice);
        common.add(R.drawable.soul_of_the_forest);
        common.add(R.drawable.southsea_deckhand);
        common.add(R.drawable.spellbreaker);
        common.add(R.drawable.spiteful_smith);
        common.add(R.drawable.stormforged_axe);
        common.add(R.drawable.stranglethorn_tiger);
        common.add(R.drawable.summoning_portal);
        common.add(R.drawable.tauren_warrior);
        common.add(R.drawable.temple_enforcer);
        common.add(R.drawable.thoughtsteal);
        common.add(R.drawable.thrallmar_farseer);
        common.add(R.drawable.tome_of_intellect);
        common.add(R.drawable.unbound_elemental);
        common.add(R.drawable.unleash_the_hounds);
        common.add(R.drawable.venture_comercenary);
        common.add(R.drawable.windfury_harpy);
        common.add(R.drawable.wisp);
        common.add(R.drawable.worgen_infiltrator);
        common.add(R.drawable.wrath);
        common.add(R.drawable.young_dragonhawk);
        common.add(R.drawable.youthful_brewmaster);

        rare.add(R.drawable.abomination);
        rare.add(R.drawable.alarm_o_bot);
        rare.add(R.drawable.aldor_peacekeeper);
        rare.add(R.drawable.ancestral_spirit);
        rare.add(R.drawable.ancient_mage);
        rare.add(R.drawable.ancient_watcher);
        rare.add(R.drawable.angry_chicken);
        rare.add(R.drawable.arcane_golem);
        rare.add(R.drawable.argent_commander);
        rare.add(R.drawable.armorsmith);
        rare.add(R.drawable.auchenai_soulpriest);
        rare.add(R.drawable.bite);
        rare.add(R.drawable.blade_flurry);
        rare.add(R.drawable.blessed_champion);
        rare.add(R.drawable.blizzard);
        rare.add(R.drawable.bloodsail_corsair);
        rare.add(R.drawable.coldlight_seer);
        rare.add(R.drawable.commanding_shout);
        rare.add(R.drawable.counterspell);
        rare.add(R.drawable.crazed_alchemist);
        rare.add(R.drawable.defender_of_argus);
        rare.add(R.drawable.demolisher);
        rare.add(R.drawable.divine_favor);
        rare.add(R.drawable.doomguard);
        rare.add(R.drawable.eaglehorn_bow);
        rare.add(R.drawable.emperor_cobra);
        rare.add(R.drawable.equality);
        rare.add(R.drawable.ethereal_arcanist);
        rare.add(R.drawable.explosive_shot);
        rare.add(R.drawable.felguard);
        rare.add(R.drawable.feral_spirit);
        rare.add(R.drawable.flare);
        rare.add(R.drawable.frothing_berserker);
        rare.add(R.drawable.gadgetzan_auctioneer);
        rare.add(R.drawable.headcrack);
        rare.add(R.drawable.holy_fire);
        rare.add(R.drawable.holy_wrath);
        rare.add(R.drawable.imp_master);
        rare.add(R.drawable.injured_blademaster);
        rare.add(R.drawable.keeper_of_the_grove);
        rare.add(R.drawable.kirin_tor_mage);
        rare.add(R.drawable.knife_juggler);
        rare.add(R.drawable.lava_burst);
        rare.add(R.drawable.lightning_storm);
        rare.add(R.drawable.lightwarden);
        rare.add(R.drawable.lightwell);
        rare.add(R.drawable.mana_addict);
        rare.add(R.drawable.mana_tide_totem);
        rare.add(R.drawable.mass_dispel);
        rare.add(R.drawable.master_of_disguise);
        rare.add(R.drawable.master_swordsmith);
        rare.add(R.drawable.mind_control_tech);
        rare.add(R.drawable.misdirection);
        rare.add(R.drawable.mortal_strike);
        rare.add(R.drawable.murloc_tidecaller);
        rare.add(R.drawable.nourish);
        rare.add(R.drawable.perditions_blade);
        rare.add(R.drawable.pintsized_summoner);
        rare.add(R.drawable.questing_adventurer);
        rare.add(R.drawable.ravenholdt_assassin);
        rare.add(R.drawable.savagery);
        rare.add(R.drawable.savannah_highmane);
        rare.add(R.drawable.secretkeeper);
        rare.add(R.drawable.shadow_madness);
        rare.add(R.drawable.shadowflame);
        rare.add(R.drawable.si7_agent);
        rare.add(R.drawable.siphon_soul);
        rare.add(R.drawable.stampeding_kodo);
        rare.add(R.drawable.starfall);
        rare.add(R.drawable.sunfury_protector);
        rare.add(R.drawable.sunwalker);
        rare.add(R.drawable.twilight_drake);
        rare.add(R.drawable.upgrade);
        rare.add(R.drawable.vaporize);
        rare.add(R.drawable.violet_teacher);
        rare.add(R.drawable.void_terror);
        rare.add(R.drawable.wild_pyromancer);
        rare.add(R.drawable.young_priestess);

        epic.add(R.drawable.ancient_of_lore);
        epic.add(R.drawable.ancient_of_war);
        epic.add(R.drawable.avenging_wrath);
        epic.add(R.drawable.bane_of_doom);
        epic.add(R.drawable.bestial_wrath);
        epic.add(R.drawable.big_game_hunter);
        epic.add(R.drawable.blood_knight);
        epic.add(R.drawable.brawl);
        epic.add(R.drawable.cabal_shadow_priest);
        epic.add(R.drawable.doomhammer);
        epic.add(R.drawable.doomsayer);
        epic.add(R.drawable.earth_elemental);
        epic.add(R.drawable.faceless_manipulator);
        epic.add(R.drawable.far_sight);
        epic.add(R.drawable.force_of_nature);
        epic.add(R.drawable.gladiator_s_longbow);
        epic.add(R.drawable.gorehowl);
        epic.add(R.drawable.hungry_crab);
        epic.add(R.drawable.icicle);
        epic.add(R.drawable.kidnapper);
        epic.add(R.drawable.lay_on_hands);
        epic.add(R.drawable.mindgames);
        epic.add(R.drawable.mountain_giant);
        epic.add(R.drawable.murloc_warleader);
        epic.add(R.drawable.patient_assassin);
        epic.add(R.drawable.pit_lord);
        epic.add(R.drawable.preparation);
        epic.add(R.drawable.pyroblast);
        epic.add(R.drawable.sea_giant);
        epic.add(R.drawable.shadowform);
        epic.add(R.drawable.shield_slam);
        epic.add(R.drawable.snake_trap);
        epic.add(R.drawable.southsea_captain);
        epic.add(R.drawable.spellbender);
        epic.add(R.drawable.sword_of_justice);
        epic.add(R.drawable.twisting_nether);

        legendary.add(R.drawable.al_akir_the_windlord);
        legendary.add(R.drawable.alexstrasza);
        legendary.add(R.drawable.archmage_antonidas);
        legendary.add(R.drawable.baron_geddon);
        legendary.add(R.drawable.bloodmage_thalnos);
        legendary.add(R.drawable.cairne_bloodhoof);
        legendary.add(R.drawable.captain_greenskin);
        legendary.add(R.drawable.cenarius);
        legendary.add(R.drawable.deathwing);
        legendary.add(R.drawable.edwin_van_cleef);
        legendary.add(R.drawable.grommash_hellscream);
        legendary.add(R.drawable.gruul);
        legendary.add(R.drawable.harrison_jones);
        legendary.add(R.drawable.hogger);
        legendary.add(R.drawable.illidan_stormrage);
        legendary.add(R.drawable.king_krush);
        legendary.add(R.drawable.king_mukla);
        legendary.add(R.drawable.leeroy_jenkins);
        legendary.add(R.drawable.lord_jaraxxus);
        legendary.add(R.drawable.lorewalker_cho);
        legendary.add(R.drawable.malygos);
        legendary.add(R.drawable.millhouse_manastorm);
        legendary.add(R.drawable.nat_pagle);
        legendary.add(R.drawable.nozdormu);
        legendary.add(R.drawable.onyxia);
        legendary.add(R.drawable.prophet_velen);
        legendary.add(R.drawable.the_beast);
        legendary.add(R.drawable.the_black_knight);
        legendary.add(R.drawable.tink_master_overspark);
        legendary.add(R.drawable.tirion_fordring);
        legendary.add(R.drawable.ysera);
    }


    private void wireWidgets() {
        card1 = findViewById(R.id.button_card1);
        card2 = findViewById(R.id.button_card2);
        card3 = findViewById(R.id.button_card3);
        card4 = findViewById(R.id.button_card4);
        card5 = findViewById(R.id.button_card5);
        next = findViewById(R.id.nextPack);
        craft = findViewById(R.id.craftCost);
        dust = findViewById(R.id.dustValue);
    }


    private void revealCard(Button b) {
        Double d = 100 * Math.random();
        if (clicked == 4 && ifRare == 0) {
            {
                if (d <= 1) {
                    //draw legendary
                    Toast.makeText(this, "Legendary", Toast.LENGTH_SHORT).show();
                    clicked++;
                    Collections.shuffle(legendary);
                    Collections.shuffle(legendary);
                    b.setBackgroundResource(legendary.get((int) (legendary.size() * Math.random())));
                    dustValue += 400;
                    craftCost += 1600;
                    craft.setText("Craft Cost: " + craftCost);
                    dust.setText("Dust Value: " + dustValue);
                    ifRare++;
                }
                if (d > 1 && d <= 6) {
                    //draw epic
                    Toast.makeText(this, "Epic", Toast.LENGTH_SHORT).show();
                    clicked++;
                    Collections.shuffle(epic);
                    Collections.shuffle(epic);
                    b.setBackgroundResource(epic.get((int) (epic.size() * Math.random())));
                    dustValue += 100;
                    craftCost += 400;
                    craft.setText("Craft Cost: " + craftCost);
                    dust.setText("Dust Value: " + dustValue);
                    ifRare++;
                }
                if (d > 6) {
                    //draw rare
                    Toast.makeText(this, "Rare", Toast.LENGTH_SHORT).show();
                    clicked++;
                    Collections.shuffle(rare);
                    Collections.shuffle(rare);
                    b.setBackgroundResource(epic.get((int) (epic.size() * Math.random())));
                    dustValue += 20;
                    craftCost += 100;
                    craft.setText("Craft Cost: " + craftCost);
                    dust.setText("Dust Value: " + dustValue);
                    ifRare++;
                }
            }
        }else {
            if (d <= 1) {
                //draw legendary
                Toast.makeText(this, "Legendary", Toast.LENGTH_SHORT).show();
                clicked++;
                Collections.shuffle(legendary);
                Collections.shuffle(legendary);
                b.setBackgroundResource(legendary.get((int) (legendary.size() * Math.random())));
                dustValue += 400;
                craftCost += 1600;
                craft.setText("Craft Cost: " + craftCost);
                dust.setText("Dust Value: " + dustValue);
                ifRare++;
            }
            if (d > 1 && d <= 6) {
                //draw epic
                Toast.makeText(this, "Epic", Toast.LENGTH_SHORT).show();
                clicked++;
                Collections.shuffle(epic);
                Collections.shuffle(epic);
                b.setBackgroundResource(epic.get((int) (epic.size() * Math.random())));
                dustValue += 100;
                craftCost += 400;
                craft.setText("Craft Cost: " + craftCost);
                dust.setText("Dust Value: " + dustValue);
                ifRare++;
            }
            if (d > 6 && d <= 29) {
                //draw rare
                Toast.makeText(this, "Rare", Toast.LENGTH_SHORT).show();
                clicked++;
                Collections.shuffle(rare);
                Collections.shuffle(rare);
                b.setBackgroundResource(epic.get((int) (epic.size() * Math.random())));
                dustValue += 20;
                craftCost += 100;
                craft.setText("Craft Cost: " + craftCost);
                dust.setText("Dust Value: " + dustValue);
                ifRare++;
            }
            if (d > 29) {
                //draw common
                Toast.makeText(this, "Common", Toast.LENGTH_SHORT).show();
                clicked++;
                Collections.shuffle(common);
                Collections.shuffle(common);
                b.setBackgroundResource(common.get((int) (common.size() * Math.random())));
                dustValue += 5;
                craftCost += 40;
                craft.setText("Craft Cost: " + craftCost);
                dust.setText("Dust Value: " + dustValue);
            }
        }
    }
}



