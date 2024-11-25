package azizi.ahmed.movieapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: List<String>,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = "1",
            title = "Harry Potter",
            year = "2001",
            genre = "Fantasy, Adventure",
            director = "Chris Columbus",
            actors = listOf("Daniel Radcliffe", "Emma Watson", "Rupert Grint"),
            plot = "An orphaned boy discovers he's a wizard and attends a magical school, where he makes friends and uncovers a dark secret about his family.",
            poster = "https://th.bing.com/th/id/OIP.p86Oos045a56ltzRNN8b3wHaLH?w=118&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
            images = listOf(
                "https://th.bing.com/th/id/OIP.MakwUv_6Myl53xW_no2OmgHaEo?w=268&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.rlIkO27MSwlReGqbI3_SNwHaEo?w=302&h=188&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.0Y86uurnh2aTIHwpJ9Xn8gHaF7?w=209&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"
            ),
            rating = "7.6"
        ),
        Movie(
            id = "2",
            title = "The Avengers",
            year = "2012",
            genre = "Action, Adventure, Sci-Fi",
            director = "Joss Whedon",
            actors = listOf("Robert Downey Jr.", "Chris Evans", "Scarlett Johansson"),
            plot = "Earth's mightiest heroes must come together and learn to fight as a team to stop Loki and his alien army from enslaving humanity.",
            poster = "https://image.tmdb.org/t/p/w500/RYMX2wcKCBAr24UyPD7xwmjaTn.jpg",
            images = listOf(
                "https://th.bing.com/th/id/OIP.9qDnDwjNhrwEkulBG3TvMgHaFj?w=220&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.VKMSKGT6_9g3mPgIQp6c4AHaEK?w=310&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.suCwI8RBP8CtUi-QurWpOAHaEe?w=311&h=188&c=7&r=0&o=5&dpr=1.3&pid=1.7"
            ),
            rating = "8.0"
        ),
        Movie(
            id = "3",
            title = "Taken",
            year = "2008",
            genre = "Action, Thriller",
            director = "Pierre Morel",
            actors = listOf("Liam Neeson", "Maggie Grace", "Famke Janssen"),
            plot = "A retired CIA agent travels across Europe and relies on his old skills to save his estranged daughter, who has been kidnapped while on a trip to Paris.",
            poster = "https://th.bing.com/th/id/OIP.zmPiFkroNN3ZqQH-IRJv_gHaLH?w=117&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
            images = listOf(
                "https://th.bing.com/th/id/OIP.2OoZc0IJf_8_Th1M1F61PgHaE8?w=208&h=139&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th?id=OIF.ooyjgy7X%2bfdzzN2T0wFkjg&w=208&h=117&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th?id=OIF.7mFlM3fwJ7hcWymDOM%2bnQw&w=208&h=116&c=7&r=0&o=5&dpr=1.3&pid=1.7"
            ),
            rating = "7.8"
        ),
        Movie(
            id = "4",
            title = "Inception",
            year = "2010",
            genre = "Sci-Fi, Thriller",
            director = "Christopher Nolan",
            actors = listOf("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page"),
            plot = "A skilled thief, who commits corporate espionage by infiltrating the subconscious of his targets, is offered a chance to have his criminal history erased.",
            poster = "https://th.bing.com/th/id/R.10ecfeef2290eff1ba6ab3da6cbc1ab5?rik=69JCx%2fkMXO45tA&riu=http%3a%2f%2f2.bp.blogspot.com%2f_ej-z27dLP7M%2fTSCSe45IHVI%2fAAAAAAAAACs%2fMxM5ol_aVrY%2fs1600%2finception2d6587339.jpg&ehk=U66ekTlGZL5IwrjEtKxuKXn0Xa1Md7HSnlx93c7dzZM%3d&risl=&pid=ImgRaw&r=0",
            images = listOf(
                "https://th.bing.com/th/id/OIP.aTRMYaSm0oeIcVRAK27ETAHaEo?w=268&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://d2hu24qj5y9mqn.cloudfront.net/wp-content/uploads/2022/05/29190748/inception-quotes-2-1024x1024.png",
                "https://th.bing.com/th/id/R.215f094b203273bebf431fa0f180bf0c?rik=BCiOMMmpmYUNsw&riu=http%3a%2f%2fpopculturenerd.com%2fwp-content%2fuploads%2f2010%2f07%2f2010_inception_018.jpg&ehk=HFaQaHJjbzlP3cJeYEzjJtTKEyD4%2bwi2qWXp%2fU5as2g%3d&risl=&pid=ImgRaw&r=0"
            ),
            rating = "8.8"
        ),
        Movie(
            id = "5",
            title = "The Dark Knight",
            year = "2008",
            genre = "Action, Crime, Drama",
            director = "Christopher Nolan",
            actors = listOf("Christian Bale", "Heath Ledger", "Aaron Eckhart"),
            plot = "When the menace known as The Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
            poster = "https://th.bing.com/th/id/OIP.NN9rKH-vZbFgtH4FuoW7OwHaLH?w=120&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
            images = listOf(
                "https://th.bing.com/th/id/OIP.zU8P45LlyXn-F874TJtR-QHaFj?w=240&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://www.pluggedin.com/wp-content/uploads/2019/12/thedarkknightrises-scaled.jpg",
                "https://th.bing.com/th/id/OIP.HTqP2pATkC6GoCbHEXBItQHaEK?rs=1&pid=ImgDetMain"
            ),
            rating = "9.0"
        ),
        Movie(
            id = "6",
            title = "Interstellar",
            year = "2014",
            genre = "Sci-Fi, Adventure, Drama",
            director = "Christopher Nolan",
            actors = listOf("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"),
            plot = "A group of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            poster = "https://image.tmdb.org/t/p/w500/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
            images = listOf(
                "https://th.bing.com/th/id/OIF.z4ZDfRl8ZJndR0TZ8SQykg?w=310&h=178&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.6G3xQed13pJJ1XvTShfftgHaE7?w=248&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th?q=Interstellar+Movie+Cast&w=120&h=120&c=1&rs=1&qlt=90&cb=1&dpr=1.3&pid=InlineBlock&mkt=en-XA&cc=DZ&setlang=en&adlt=strict&t=1&mw=247"
            ),
            rating = "8.6"
        ),
        Movie(
            id = "7",
            title = "Inglourious Basterds",
            year = "2009",
            genre = "War, Action, Drama",
            director = "Quentin Tarantino",
            actors = listOf("Brad Pitt", "Diane Kruger", "Eli Roth"),
            plot = "In Nazi-occupied France, a group of Jewish U.S. soldiers plan a campaign to assassinate key German leaders.",
            poster = "https://image.tmdb.org/t/p/w500/7sfbEnaARXDDhKm0CZ7D7uc2sbo.jpg",
            images = listOf(
                "https://th.bing.com/th/id/OIP.-Ag-TXALhgmwi-1DqEmnLAHaEK?w=284&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.E9JCY9MlWfsSmp-nqwOREwHaHa?w=178&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.5jMAnsH9BpQZbwKGpsTOQgHaDJ?w=277&h=148&c=7&r=0&o=5&dpr=1.3&pid=1.7"
            ),
            rating = "8.3"
        ),
        Movie(
            id = "8",
            title = "The Matrix",
            year = "1999",
            genre = "Sci-Fi, Action",
            director = "Lana Wachowski, Lilly Wachowski",
            actors = listOf("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss"),
            plot = "A hacker learns about the true nature of his reality and his role in the fight against its controllers.",
            poster = "https://th.bing.com/th/id/OIP.2XCmKprKwfI1FNWYrXvXzwHaK9?w=134&h=199&c=7&r=0&o=5&dpr=1.3&pid=1.7",
            images = listOf(
                "https://th.bing.com/th/id/OIP.OTQ7fh1eWJXpPehda8GdHQHaFj?w=245&h=184&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.CXCf_i4cB82OxR_qYq47AwHaDt?w=317&h=174&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.XRuKkCteKZW1WCdTV4-V2QHaDt?w=350&h=175&c=7&r=0&o=5&dpr=1.3&pid=1.7"
            ),
            rating = "8.7"
        ),
        Movie(
            id = "9",
            title = "The Shawshank Redemption",
            year = "1994",
            genre = "Drama",
            director = "Frank Darabont",
            actors = listOf("Tim Robbins", "Morgan Freeman", "Bob Gunton"),
            plot = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
            poster = "https://th.bing.com/th/id/OIP.w0SK_ZRdaWbnC2goV4kbYAHaLH?w=115&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
            images = listOf(
                "https://th.bing.com/th/id/OIP.l72S7nLyOBGHI2QvOnSzXQHaEK?w=274&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.o3ZnNwcRa77g9Ivlze3BQAHaEK?w=274&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.Twfna3DlZylMcILJmzGWrgHaFj?w=213&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7"
            ),
            rating = "9.3"
        ),
        Movie(
            id = "10",
            title = "Fight Club",
            year = "1999",
            genre = "Drama",
            director = "David Fincher",
            actors = listOf("Brad Pitt", "Edward Norton", "Helena Bonham Carter"),
            plot = "An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more.",
            poster = "https://image.tmdb.org/t/p/w500/pB8BM7pdSp6B6Ih7QZ4DrQ3PmJK.jpg",
            images = listOf(
                "https://th.bing.com/th/id/OIP.THKA4_XVbHtqCNi4pg2z7QHaEK?w=312&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.rJHdJl0c8oDzr33pIMyfcQHaEK?w=322&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "https://th.bing.com/th/id/OIP.2ERFjdOvi4-IlDSmWSBcvAHaDF?w=336&h=146&c=7&r=0&o=5&dpr=1.3&pid=1.7"
            ),
            rating = "8.8"
        )
    )
}
