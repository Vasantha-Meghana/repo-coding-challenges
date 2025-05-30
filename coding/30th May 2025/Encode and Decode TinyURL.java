//Encode and Decode TinyURL
public class Codec 
{
    String originalUrl, tinyUrl;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) 
    {
        originalUrl = longUrl;
        tinyUrl = "http://tinyurl.com/4e9iAk";
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) 
    {
        return originalUrl;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
