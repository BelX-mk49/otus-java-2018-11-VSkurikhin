package ru.otus.utils;

import ru.otus.exeptions.ExceptionIO;

import java.io.*;
import java.util.function.Consumer;

public class IOHelper
{
    public static BufferedReader getBufferedReaderFromString(String stream)
    {
        return new BufferedReader(new StringReader(stream));
    }

    public static BufferedReader getBufferedReader(File fin) throws FileNotFoundException
    {
        return new BufferedReader(new FileReader(fin));
    }

    public static BufferedReader getBufferedReader(Class<?> clazz, String resource)
    {
        return new BufferedReader(new InputStreamReader(
            clazz.getClassLoader().getResourceAsStream(resource)
        ));
    }

    public static void readFile(File fin, Consumer<String> workWithLine) throws ExceptionIO
    {
        try (BufferedReader br = getBufferedReader(fin)) {
            String line = null;
            while ((line = br.readLine()) != null) {
                workWithLine.accept(line);
            }
        }
        catch (IOException e) {
            throw new ExceptionIO(e);
        }
    }

    public static void readFile(Class<?> clazz, String resource, Consumer<String> workWithLine)
    throws ExceptionIO
    {
        try (BufferedReader br = getBufferedReader(clazz, resource)) {
            String line = null;
            while ((line = br.readLine()) != null) {
                workWithLine.accept(line);
            }
        }
        catch (IOException e) {
            throw new ExceptionIO(e);
        }
    }
}
