--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

--
-- Name: city_city_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE city_city_id_seq
    START WITH 796
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.city_city_id_seq OWNER TO anaconda;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: city; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE city (
    city_id bigint DEFAULT nextval('city_city_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL,
    country_id bigint NOT NULL,
    description character varying(65536),
    gallery_id bigint,
    latitude character varying(256),
    longitude character varying(256),
    ufl character varying(256),
    is_enabled boolean
);


ALTER TABLE public.city OWNER TO anaconda;

--
-- Name: company_company_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE company_company_id_seq
    START WITH 64
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.company_company_id_seq OWNER TO anaconda;

--
-- Name: company; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE company (
    company_id bigint DEFAULT nextval('company_company_id_seq'::regclass) NOT NULL,
    company_category_id bigint,
    name character varying(256) NOT NULL,
    description character varying(65536),
    gallery_id bigint,
    ufl character varying(256),
    company_cruise_category_id bigint
);


ALTER TABLE public.company OWNER TO anaconda;

--
-- Name: company_category_company_category_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE company_category_company_category_id_seq
    START WITH 5
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.company_category_company_category_id_seq OWNER TO anaconda;

--
-- Name: company_category; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE company_category (
    company_category_id bigint DEFAULT nextval('company_category_company_category_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL
);


ALTER TABLE public.company_category OWNER TO anaconda;

--
-- Name: continent_continent_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE continent_continent_id_seq
    START WITH 109
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.continent_continent_id_seq OWNER TO anaconda;

--
-- Name: continent; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE continent (
    continent_id bigint DEFAULT nextval('continent_continent_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL,
    description character varying(65536),
    gallery_id bigint
);


ALTER TABLE public.continent OWNER TO anaconda;

--
-- Name: country_country_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE country_country_id_seq
    START WITH 116
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.country_country_id_seq OWNER TO anaconda;

--
-- Name: country; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE country (
    country_id bigint DEFAULT nextval('country_country_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL,
    description character varying(65536),
    gallery_id bigint
);


ALTER TABLE public.country OWNER TO anaconda;

--
-- Name: cruise_cruise_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE cruise_cruise_id_seq
    START WITH 10064
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cruise_cruise_id_seq OWNER TO anaconda;

--
-- Name: cruise; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE cruise (
    cruise_id bigint DEFAULT nextval('cruise_cruise_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL,
    cruise_category_id bigint NOT NULL,
    vessel_id bigint NOT NULL,
    description character varying(65536),
    gallery_id bigint,
    region_id bigint,
    cruise_language_service_id bigint,
    description_gallery_id bigint,
    is_simple_description boolean NOT NULL,
    simple_price_description character varying(65536),
    simple_route_description character varying(65536),
    simple_itinerary_description character varying(65535),
    currency_id bigint,
    price_value integer,
    ufl character varying(256),
    special_offer character varying(256),
    is_import boolean
);


ALTER TABLE public.cruise OWNER TO anaconda;

--
-- Name: cruise_category_cruise_category_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE cruise_category_cruise_category_id_seq
    START WITH 47
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cruise_category_cruise_category_id_seq OWNER TO anaconda;

--
-- Name: cruise_category; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE cruise_category (
    cruise_category_id bigint DEFAULT nextval('cruise_category_cruise_category_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL,
    description character varying(65536)
);


ALTER TABLE public.cruise_category OWNER TO anaconda;

--
-- Name: cruise_city_cruise_city_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE cruise_city_cruise_city_id_seq
    START WITH 797
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cruise_city_cruise_city_id_seq OWNER TO anaconda;

--
-- Name: cruise_city; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE cruise_city (
    cruise_city_id bigint DEFAULT nextval('cruise_city_cruise_city_id_seq'::regclass) NOT NULL,
    cruise_id bigint NOT NULL,
    city_id bigint NOT NULL
);


ALTER TABLE public.cruise_city OWNER TO anaconda;

--
-- Name: cruise_date_range_cruise_date_range_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE cruise_date_range_cruise_date_range_id_seq
    START WITH 10111
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cruise_date_range_cruise_date_range_id_seq OWNER TO anaconda;

--
-- Name: cruise_date_range; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE cruise_date_range (
    cruise_date_range_id bigint DEFAULT nextval('cruise_date_range_cruise_date_range_id_seq'::regclass) NOT NULL,
    begin_date date NOT NULL,
    end_date date NOT NULL,
    cruise_id bigint NOT NULL,
    start_sity_id bigint
);


ALTER TABLE public.cruise_date_range OWNER TO anaconda;

--
-- Name: cruise_language_service_cruise_language_service_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE cruise_language_service_cruise_language_service_id_seq
    START WITH 2
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cruise_language_service_cruise_language_service_id_seq OWNER TO anaconda;

--
-- Name: cruise_language_service; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE cruise_language_service (
    cruise_language_service_id bigint DEFAULT nextval('cruise_language_service_cruise_language_service_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL,
    icon_class character varying(128)
);


ALTER TABLE public.cruise_language_service OWNER TO anaconda;

--
-- Name: file_file_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE file_file_id_seq
    START WITH 22514791
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.file_file_id_seq OWNER TO anaconda;

--
-- Name: file; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE file (
    file_id bigint DEFAULT nextval('file_file_id_seq'::regclass) NOT NULL,
    name character varying(256),
    original_name character varying(256) NOT NULL,
    content bytea NOT NULL,
    content_type character varying(256) NOT NULL,
    thumbnail bytea NOT NULL,
    gallery_id bigint NOT NULL
);


ALTER TABLE public.file OWNER TO anaconda;

--
-- Name: gallery_gallery_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE gallery_gallery_id_seq
    START WITH 3477315
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.gallery_gallery_id_seq OWNER TO anaconda;

--
-- Name: gallery; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE gallery (
    gallery_id bigint DEFAULT nextval('gallery_gallery_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL,
    default_file_id bigint
);


ALTER TABLE public.gallery OWNER TO anaconda;

--
-- Name: region_region_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE region_region_id_seq
    START WITH 133
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.region_region_id_seq OWNER TO anaconda;

--
-- Name: region; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE region (
    region_id bigint DEFAULT nextval('region_region_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL,
    description character varying(65536) NOT NULL,
    continent_id bigint NOT NULL,
    gallery_id bigint
);


ALTER TABLE public.region OWNER TO anaconda;

--
-- Name: vessel_vessel_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE vessel_vessel_id_seq
    START WITH 387
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.vessel_vessel_id_seq OWNER TO anaconda;

--
-- Name: vessel; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE vessel (
    vessel_id bigint DEFAULT nextval('vessel_vessel_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL,
    vessel_category_id bigint NOT NULL,
    description character varying(65536) NOT NULL,
    company_id bigint NOT NULL,
    gallery_id bigint,
    build_year date,
    width double precision,
    length double precision,
    speed double precision,
    capacity integer,
    balancer boolean,
    deck_quantity integer,
    cabin_quantity integer,
    restaurant_quantity integer,
    lift_quantity integer,
    pool_quantity integer,
    description_gallery_id bigint,
    schema_gallery_id bigint,
    ufl character varying(256),
    is_import boolean,
    is_enabled boolean
);


ALTER TABLE public.vessel OWNER TO anaconda;

--
-- Name: vessel_category_vessel_category_id_seq; Type: SEQUENCE; Schema: public; Owner: anaconda
--

CREATE SEQUENCE vessel_category_vessel_category_id_seq
    START WITH 4
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.vessel_category_vessel_category_id_seq OWNER TO anaconda;

--
-- Name: vessel_category; Type: TABLE; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE TABLE vessel_category (
    vessel_category_id bigint DEFAULT nextval('vessel_category_vessel_category_id_seq'::regclass) NOT NULL,
    name character varying(256) NOT NULL
);


ALTER TABLE public.vessel_category OWNER TO anaconda;

--
-- Name: pkcity; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY city
    ADD CONSTRAINT pkcity PRIMARY KEY (city_id);


--
-- Name: pkcompany; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY company
    ADD CONSTRAINT pkcompany PRIMARY KEY (company_id);


--
-- Name: pkcompany_category; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY company_category
    ADD CONSTRAINT pkcompany_category PRIMARY KEY (company_category_id);


--
-- Name: pkcontinent; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY continent
    ADD CONSTRAINT pkcontinent PRIMARY KEY (continent_id);


--
-- Name: pkcountry; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY country
    ADD CONSTRAINT pkcountry PRIMARY KEY (country_id);


--
-- Name: pkcruise; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY cruise
    ADD CONSTRAINT pkcruise PRIMARY KEY (cruise_id);


--
-- Name: pkcruise_category; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY cruise_category
    ADD CONSTRAINT pkcruise_category PRIMARY KEY (cruise_category_id);


--
-- Name: pkcruise_city; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY cruise_city
    ADD CONSTRAINT pkcruise_city PRIMARY KEY (cruise_city_id);


--
-- Name: pkcruise_date_range; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY cruise_date_range
    ADD CONSTRAINT pkcruise_date_range PRIMARY KEY (cruise_date_range_id);


--
-- Name: pkcruise_language_service; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY cruise_language_service
    ADD CONSTRAINT pkcruise_language_service PRIMARY KEY (cruise_language_service_id);


--
-- Name: pkfile; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY file
    ADD CONSTRAINT pkfile PRIMARY KEY (file_id);


--
-- Name: pkgallery; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY gallery
    ADD CONSTRAINT pkgallery PRIMARY KEY (gallery_id);


--
-- Name: pkregion; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY region
    ADD CONSTRAINT pkregion PRIMARY KEY (region_id);


--
-- Name: pkvessel; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY vessel
    ADD CONSTRAINT pkvessel PRIMARY KEY (vessel_id);


--
-- Name: pkvessel_category; Type: CONSTRAINT; Schema: public; Owner: anaconda; Tablespace: 
--

ALTER TABLE ONLY vessel_category
    ADD CONSTRAINT pkvessel_category PRIMARY KEY (vessel_category_id);


--
-- Name: city_country_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "city_country_id_Idx" ON city USING btree (country_id);


--
-- Name: city_gallery_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "city_gallery_id_Idx" ON city USING btree (gallery_id);


--
-- Name: city_is_enabled_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "city_is_enabled_Idx" ON city USING btree (is_enabled);


--
-- Name: company_category_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "company_category_id_Idx" ON company USING btree (company_category_id);


--
-- Name: company_company_cruise_category_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "company_company_cruise_category_id_Idx" ON company USING btree (company_cruise_category_id);


--
-- Name: company_gallery_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "company_gallery_id_Idx" ON company USING btree (gallery_id);


--
-- Name: country_gallery_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "country_gallery_id_Idx" ON country USING btree (gallery_id);


--
-- Name: cruise_city_city_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "cruise_city_city_id_Idx" ON cruise_city USING btree (city_id);


--
-- Name: cruise_city_cruise_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "cruise_city_cruise_id_Idx" ON cruise_city USING btree (cruise_id);


--
-- Name: cruise_date_range_cruise_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "cruise_date_range_cruise_id_Idx" ON cruise_date_range USING btree (cruise_id);


--
-- Name: cruise_date_range_start_sity_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "cruise_date_range_start_sity_id_Idx" ON cruise_date_range USING btree (start_sity_id);


--
-- Name: file_gallery_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "file_gallery_id_Idx" ON file USING btree (gallery_id);


--
-- Name: gallery_default_file_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "gallery_default_file_id_Idx" ON gallery USING btree (default_file_id);


--
-- Name: vessel_company_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "vessel_company_id_Idx" ON vessel USING btree (company_id);


--
-- Name: vessel_description_gallery_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "vessel_description_gallery_id_Idx" ON vessel USING btree (description_gallery_id);


--
-- Name: vessel_gallery_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "vessel_gallery_id_Idx" ON vessel USING btree (gallery_id);


--
-- Name: vessel_is_enabled_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "vessel_is_enabled_Idx" ON vessel USING btree (is_enabled);


--
-- Name: vessel_schema_gallery_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "vessel_schema_gallery_id_Idx" ON vessel USING btree (schema_gallery_id);


--
-- Name: vessel_vessel_category_id_Idx; Type: INDEX; Schema: public; Owner: anaconda; Tablespace: 
--

CREATE INDEX "vessel_vessel_category_id_Idx" ON vessel USING btree (vessel_category_id);


--
-- Name: fk_city_country_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY city
    ADD CONSTRAINT fk_city_country_id FOREIGN KEY (country_id) REFERENCES country(country_id) ON DELETE RESTRICT;


--
-- Name: fk_city_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY city
    ADD CONSTRAINT fk_city_gallery_id FOREIGN KEY (gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_company_company_category_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY company
    ADD CONSTRAINT fk_company_company_category_id FOREIGN KEY (company_category_id) REFERENCES company_category(company_category_id) ON DELETE RESTRICT;


--
-- Name: fk_company_company_cruise_category_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY company
    ADD CONSTRAINT fk_company_company_cruise_category_id FOREIGN KEY (company_cruise_category_id) REFERENCES cruise_category(cruise_category_id);


--
-- Name: fk_company_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY company
    ADD CONSTRAINT fk_company_gallery_id FOREIGN KEY (gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_continent_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY continent
    ADD CONSTRAINT fk_continent_gallery_id FOREIGN KEY (gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_country_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY country
    ADD CONSTRAINT fk_country_gallery_id FOREIGN KEY (gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_cruise_city_city_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY cruise_city
    ADD CONSTRAINT fk_cruise_city_city_id FOREIGN KEY (city_id) REFERENCES city(city_id) ON DELETE RESTRICT;


--
-- Name: fk_cruise_city_cruise_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY cruise_city
    ADD CONSTRAINT fk_cruise_city_cruise_id FOREIGN KEY (cruise_id) REFERENCES cruise(cruise_id) ON DELETE CASCADE;


--
-- Name: fk_cruise_cruise_category_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY cruise
    ADD CONSTRAINT fk_cruise_cruise_category_id FOREIGN KEY (cruise_category_id) REFERENCES cruise_category(cruise_category_id) ON DELETE RESTRICT;


--
-- Name: fk_cruise_cruise_language_service_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY cruise
    ADD CONSTRAINT fk_cruise_cruise_language_service_id FOREIGN KEY (cruise_language_service_id) REFERENCES cruise_language_service(cruise_language_service_id) ON DELETE SET NULL;


--
-- Name: fk_cruise_date_range_cruise_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY cruise_date_range
    ADD CONSTRAINT fk_cruise_date_range_cruise_id FOREIGN KEY (cruise_id) REFERENCES cruise(cruise_id) ON DELETE CASCADE;


--
-- Name: fk_cruise_description_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY cruise
    ADD CONSTRAINT fk_cruise_description_gallery_id FOREIGN KEY (description_gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_cruise_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY cruise
    ADD CONSTRAINT fk_cruise_gallery_id FOREIGN KEY (gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_cruise_region_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY cruise
    ADD CONSTRAINT fk_cruise_region_id FOREIGN KEY (region_id) REFERENCES region(region_id) ON DELETE SET NULL;


--
-- Name: fk_cruise_vessel_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY cruise
    ADD CONSTRAINT fk_cruise_vessel_id FOREIGN KEY (vessel_id) REFERENCES vessel(vessel_id) ON DELETE CASCADE;


--
-- Name: fk_file_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY file
    ADD CONSTRAINT fk_file_gallery_id FOREIGN KEY (gallery_id) REFERENCES gallery(gallery_id) ON DELETE CASCADE;


--
-- Name: fk_gallery_default_file_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY gallery
    ADD CONSTRAINT fk_gallery_default_file_id FOREIGN KEY (default_file_id) REFERENCES file(file_id) ON DELETE SET NULL;


--
-- Name: fk_region_continent_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY region
    ADD CONSTRAINT fk_region_continent_id FOREIGN KEY (continent_id) REFERENCES continent(continent_id) ON DELETE RESTRICT;


--
-- Name: fk_region_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY region
    ADD CONSTRAINT fk_region_gallery_id FOREIGN KEY (gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_vessel_company_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY vessel
    ADD CONSTRAINT fk_vessel_company_id FOREIGN KEY (company_id) REFERENCES company(company_id) ON DELETE RESTRICT;


--
-- Name: fk_vessel_description_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY vessel
    ADD CONSTRAINT fk_vessel_description_gallery_id FOREIGN KEY (description_gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_vessel_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY vessel
    ADD CONSTRAINT fk_vessel_gallery_id FOREIGN KEY (gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_vessel_schema_gallery_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY vessel
    ADD CONSTRAINT fk_vessel_schema_gallery_id FOREIGN KEY (schema_gallery_id) REFERENCES gallery(gallery_id) ON DELETE SET NULL;


--
-- Name: fk_vessel_vessel_category_id; Type: FK CONSTRAINT; Schema: public; Owner: anaconda
--

ALTER TABLE ONLY vessel
    ADD CONSTRAINT fk_vessel_vessel_category_id FOREIGN KEY (vessel_category_id) REFERENCES vessel_category(vessel_category_id) ON DELETE RESTRICT;


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

