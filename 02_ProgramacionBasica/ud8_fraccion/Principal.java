package ud8_fraccion;

import java.util.Random;

public class Principal {

	//public Fraccion() {
	//public Fraccion(int numerador) {	
	//public Fraccion(int numerador, int denominador) {		

	//public Fraccion invertir() {
	//public Fraccion simplificar() {

	//public Fraccion sumar( int n ) {		
	//public Fraccion sumar( Fraccion f ){
	//public Fraccion restar( int n ) {		
	//public Fraccion restar( Fraccion f ){
	//public Fraccion dividir( int n ) {
	//public Fraccion dividir( Fraccion f ){
	//public Fraccion multiplicar( int n ) {
	//public Fraccion multiplicar( Fraccion f ){

	//public static Fraccion multiplicar( Fraccion f1, Fraccion f2 ){

	//@Override
	//public String toString(){

	//private int mcd(int num1, int num2) {
	//private int mcm(int num1, int num2) {


	public static void main(String[] args) {
		
		
		Fraccion f13 = new Fraccion(18, 27);
		Fraccion f14 = new Fraccion(2, 3);
		
		if (f14.equals(f13)) {
			System.out.println("son iguales");
		}
		else {
			System.out.println("no son iguales");
		}
		
		
		
		Fraccion f1 = new Fraccion();
		Fraccion f2 = new Fraccion(3);
		Fraccion f3 = new Fraccion(18, 27);	
		
		System.out.println( "f1:              " + f1 );
		System.out.println( "f2:              " + f2 );
		System.out.println( "f3:              " + f3 );
		System.out.println( "" );
		
		System.out.println( "1 / f3:          " + f3.invertir() );
		System.out.println( "f3 simplificada: " + f3.simplificar() );
		
		System.out.println( "" );
		System.out.println( "f3 + 2:          " + f3.sumar(2) );
		System.out.println( "f1 + (1 / f2):   " + f1.sumar(f2.invertir()) );
		System.out.println( "" );
		System.out.println( "f3 - 3:          " + f3.restar(3) );
		System.out.println( "f1 - (1 / f2):   " + f1.restar(f2.invertir()) );
		System.out.println( "" );
		System.out.println( "f3 * 5:          " + f3.multiplicar(5) );
		System.out.println( "f1 * (1 / f2):   " + f1.multiplicar(f2.invertir()) );
		System.out.println( "" );
		System.out.println( "f3 / 7:          " + f3.dividir(7) );
		System.out.println( "f1 / (1 / f2):   " + f1.dividir(f2.invertir()) );
		System.out.println( "" );
		System.out.println( "f1 * f2:         " + Fraccion.multiplicar(f1, f2) );
		
	}

}