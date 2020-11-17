package util;

import core.Main;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.User;
import java.awt.*;

import java.util.Arrays;
import java.util.List;

import static core.Main.jda;

public class Config{
    public static final String GUILDID = "611583174723764234";
    //public static final Role adminRole = Main.jda.getGuildById(GUILDID).getRoleById("634748404991262721");
    //public static final User bot = Main.jda.getUserById("687260064469221410");
    public static final String PREFIX = ".";
    public static final EmbedBuilder HELPMASSAGE = EmbedBuilder.EmbedBuilder("Help",null, Color.GREEN,"Help isn't configured actually \n Vorschläge erwünscht");    //"Hilfe kriegst du bei <@418861325435797514>";

    public static final String DateChannelId = "719198959389900870";
    public static final String memberCountChannelId = "704268797795762187";
    public static final String onlineMemberCountId = "704268857736691793";

    public static final List<String> CategorieRoles = Arrays.asList("694931364725784647","704298093893648465","695270237049978920","704291838017798207","695270305236779110");
    public static final String OwnerId = "562708005905235978";
    public static final User owner = jda.getUserById(OwnerId);
    public static final Role Verifiziertrole = null; // Main.jda.getGuildById(GUILDID).getRoleById("696415745885732964");

}
