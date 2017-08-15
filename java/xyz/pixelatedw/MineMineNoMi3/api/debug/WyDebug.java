package xyz.pixelatedw.MineMineNoMi3.api.debug;

import java.lang.management.ManagementFactory;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import xyz.pixelatedw.MineMineNoMi3.MainMod;

public class WyDebug
{
	public static boolean isDebug()
	{
		return ManagementFactory.getRuntimeMXBean().getInputArguments().toString().indexOf("-agentlib:jdwp") > 0;
	}

	public static void info(Object msg)
	{
		FMLLog.log(MainMod.getMineMineNoMi().getModId(), Level.INFO, String.valueOf(msg));
	}

	public static void warn(Object msg)
	{
		FMLLog.log(MainMod.getMineMineNoMi().getModId(), Level.WARN, String.valueOf(msg));
	}

	public static void error(Object msg)
	{
		FMLLog.log(MainMod.getMineMineNoMi().getModId(), Level.ERROR, String.valueOf(msg));
	}
	
	public static void debug(Object msg)
	{
		FMLLog.log(MainMod.getMineMineNoMi().getModId(), Level.DEBUG, String.valueOf(msg));
	}
}
