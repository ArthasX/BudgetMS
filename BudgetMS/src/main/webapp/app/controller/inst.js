Ext.define('BudgetMS.controller.inst', {
	extend : 'Ext.app.Controller',
	stores : [ 'instStore', 'treeMenuStore' ],
	views : [ 'inst.list', 'inst.edit', 'menu.treeMenu', 'inst.add' ],
	models : [ 'inst' ],
	init : function() {
		this.control({
			'instList' : {
				itemdblclick : this.editInst
			},
			'instList button[id=showAddInst]' : {
				click : this.showAddInst
			},
			'instAdd button[action=doAddInst]' : {
				click : this.doAdd
			}
		});
	},

	editInst : function(grid, record) {
		console.log('Double clicked on ' + record.get('instId'));
		// Ext.MessageBox.alert("123","123");
		var view = Ext.widget('instEdit');
		view.down('form').loadRecord(record);
	},

	showAddInst : function() {
		console.log('click addInst button');
		var view = Ext.widget('instAdd');

	},

	doAdd : function(btn,e,eOpts) {
		var s = btn.up('window').down('form').getForm().findField('instType').getValue();
		alert(s);
	}
});