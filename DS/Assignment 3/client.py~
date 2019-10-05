#source: https://www.geeksforgeeks.org/cristians-algorithm/

import socket
import datetime

#initialize the clock server
def initiateClockServer():
	s = socket.socket()
	print("Socket successfully created")
	
	#Server port
	port = 8000
	
	s.bind(('', port))
	
	#Start listening to requests
	s.listen(5)
	print("Socket is listening")
	
	#Run clock server forever
	while True:
		
		#Establish connection with client
		conn, addr = s.accept()
		print("Server connected to ", addr)
		
		#Send server clock time to client
		conn.send(str(datetime.datetime.now()).encode())
		
		#Close the client connection
		conn.close()
	
	#Driver function
	if __name__ == "__main__":
		
		#Trigger the clock server
		initiateClockServer()
