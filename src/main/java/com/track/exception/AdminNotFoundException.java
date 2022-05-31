package com.track.exception;

	public class AdminNotFoundException extends RuntimeException {

		/**
		 * 
		 */
		
		private static final long serialVersionUID = -2446153442582965706L;
		
		public AdminNotFoundException() {
			
		}
		
		public AdminNotFoundException(String message) {
			super(message);
		}

	}


