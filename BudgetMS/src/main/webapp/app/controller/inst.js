Ext.define('BudgetMS.controller.inst', {
	extend : 'Ext.app.Controller',
	stores : [ 'instStore' ],
	views : [ 'inst.list' ],
	models : [ 'inst' ],
	init : function() {
		this.control({
			'instlist' : {
				itemdblclick : this.editInst
			}
		});
	},

	editInst : function(grid, record) {
		console.log('Double clicked on ' + record.get('instId'));
	}
});