package soccerSystemDemo.Domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by L.z Double E on 8/7/2017.
 */

@Entity
public class Team implements Serializable, Comparable<Team>{

    @Id
    private String id;
    private String name;
    private String manager;
    private int players;
    private String location;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public int getPlayers() {
        return players;
    }

    public String getLocation() {
        return location;
    }

    private Team(){}

    public Team(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.manager = builder.manager;
        this.players = builder.players;
        this.location = builder.location;
    }

    public static class Builder {
        private String id;
        private String name;
        private String manager;
        private int players;
        private String location;


        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder manager(String value) {
            this.manager = value;
            return this;
        }

        public Builder players(int value) {
            this.players = value;
            return this;
        }

        public Builder location(String value) {
            this.location = value;
            return this;
        }

        public Team build() {
            return new Team(this);
        }

    }
        public int compareTo(Team team)
        {
            return id.compareTo(team.id);
        }
        @Override
        public boolean equals (Object o)
        {
            if (this == o) return true;
            if(o == null ||getClass() !=o.getClass()) return false;

            Team team = (Team) o;

            return id .equals(team.id);
        }

        @Override
        public int hashCode()
        {
            return id.hashCode();
        }

        @Override
        public String toString()
        {
            return "Team{" +
                    "id='" + id + '\'' +
                    ", Team_name='" + name +'\''+
                    ", Manager='" + manager +'\''+
                    ", players='" + players +'\''+
                    ", location='" + location +'\''+
                    '}';
        }
}





